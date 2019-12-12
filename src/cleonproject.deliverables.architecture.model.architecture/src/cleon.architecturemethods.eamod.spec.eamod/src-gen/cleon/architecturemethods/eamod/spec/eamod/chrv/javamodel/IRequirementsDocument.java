package cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementsDocument extends cleon.common.doc.doc.spec.document.javamodel.INamedDocument, cleon.common.doc.doc.spec.chapter.about.javamodel.IAboutAware, cleon.common.glossary.spec.glossary.javamodel.IGlossaryAware, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4bcb71bd-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.about.javamodel.IEAMod_About selectAbout();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.introduction.javamodel.IIntroduction selectIntroduction();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation selectMotivation();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea selectRequirements();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions selectDestinctions();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISources selectSources();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssues selectIssues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,Umev2XYVvGEm0h/OLneDNPbTH/Q=] */
