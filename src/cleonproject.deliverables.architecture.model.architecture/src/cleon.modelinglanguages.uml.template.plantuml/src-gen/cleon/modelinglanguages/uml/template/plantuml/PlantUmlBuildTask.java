package cleon.modelinglanguages.uml.template.plantuml;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import ch.actifsource.generator.AbstractBuildTaskSingleThread;
import ch.actifsource.generator.console.IGeneratorConsole;
import ch.actifsource.generator.target.ISingleThreadBuildTargetInfo;
import ch.actifsource.util.ICancelStatus;
import ch.actifsource.util.file.IAsFile;
import ch.actifsource.util.file.IAsFolder;

public class PlantUmlBuildTask extends AbstractBuildTaskSingleThread {
	private static final ExecutorService _executer = Executors.newFixedThreadPool(8);
	private final List<String> _commands = new ArrayList<String>();
	
	public PlantUmlBuildTask(ch.actifsource.core.INode buildTask, ICancelStatus status) {
		super(buildTask, status);
	}

	protected ch.actifsource.core.dependency.IDependency internalGenerate(ISingleThreadBuildTargetInfo targetInfo)
			throws ch.actifsource.generator.GenerationException {

		if(_commands.isEmpty())
		{
			_commands.add("java");
			_commands.add("-jar");
			_commands.add("\"C:\\ProgramData\\chocolatey\\lib\\plantuml\\tools\\plantuml.jar\"");
			_commands.add("-tpng");
			_commands.add("-duration");
			_commands.add("-progress");
		}
			
		IAsFolder targetFolder = targetInfo.getOutputScope().getFolder(targetInfo.getOutputPath());
		try {
			processFolder(targetFolder, targetInfo.getBuildContext().console());
		} catch (IOException e) {
			throw new ch.actifsource.generator.GenerationException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new ch.actifsource.generator.GenerationException(e);
		}
		
		return null;
	}
	
	private static String read(InputStream input) throws IOException {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
            return buffer.readLine();
        }
    }	
	
	private void processFolder(IAsFolder folder, IGeneratorConsole generatorConsole) throws IOException, NoSuchAlgorithmException {
		if(folder == null)
			return;
			
		for (IAsFile plantAsUmlFile : folder.getFiles()) {
			if (plantAsUmlFile.getName().endsWith(".puml")) {
				if (isCanceled())
					return;
								
				printFileName(folder, generatorConsole, plantAsUmlFile);
				
				if( createOrVerifyHashFile(generatorConsole, folder, plantAsUmlFile) ) 
				{
					List<String> command = new ArrayList<String>(_commands);
					command.add(plantAsUmlFile.getName());

					ProcessBuilder pb = new ProcessBuilder(command);
					File adapter = folder.getAdapter(File.class);
					pb = pb.directory(adapter);

					ProcessRunnable interruptOnCancel = new ProcessRunnable(pb, console(), getCancelStatus());
					_executer.submit(interruptOnCancel);					
				}
				
				generatorConsole.info().println();
			}
		}

		for (IAsFolder subFolder : folder.getSubFolders()) {
			processFolder(subFolder, generatorConsole);
		}
	}

	private void printFileName(IAsFolder folder, IGeneratorConsole generatorConsole, IAsFile plantAsUmlFile) {		

		generatorConsole.info().print("Processing plantuml ");
		generatorConsole.info().print(plantAsUmlFile, 0, 0, plantAsUmlFile.getName());
	}

	private boolean createOrVerifyHashFile(IGeneratorConsole generatorConsole, IAsFolder folder, IAsFile pumlFile)
			throws IOException, NoSuchAlgorithmException {
		
		IAsFile hashCodeFile = folder.getFile(pumlFile.getName().concat(".md5"));
		String hashCodeOfFile = getHashCode(pumlFile);
		generatorConsole.info().print(": Hashcode " + hashCodeOfFile);		
		if(hashCodeFile.exists())
		{
			String hashCode = read(hashCodeFile.getContents());
			if(hashCodeOfFile.equals(hashCode))
			{
				generatorConsole.info().print(" -> skipping (hash)");
				return false;
			}
			hashCodeFile.delete();
		}
		
		try( ByteArrayInputStream inputStream = new ByteArrayInputStream(hashCodeOfFile.getBytes()))
		{
			hashCodeFile.write(inputStream);					
		}
		return true;
	}

	private String getHashCode(IAsFile pumlFile) throws NoSuchAlgorithmException, IOException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		try (InputStream is = pumlFile.getContents();
			DigestInputStream dis = new DigestInputStream(is, md)) 
		{
			while (dis.read() != -1) ; //empty loop to clear the data
	        	md = dis.getMessageDigest();
		}
		byte[] digest = md.digest();
		
	    String hashCodeOfFile = byteArrayToHex(digest).toUpperCase();
		return hashCodeOfFile;
	}
	
	private static String byteArrayToHex(byte[] a) {
		   StringBuilder sb = new StringBuilder(a.length * 2);
		   for(byte b: a)
		      sb.append(String.format("%02x", b));
		   return sb.toString();
		}	
}