package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7106baaa-3c77-11e6-aafa-bd565efc0ead,imports]] */

/* End Protected Region   [[7106baaa-3c77-11e6-aafa-bd565efc0ead,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[7106baaa-3c77-11e6-aafa-bd565efc0ead]] */
  
  /* End Protected Region   [[7106baaa-3c77-11e6-aafa-bd565efc0ead]] */


  public static interface IModelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7d9d3c83-3c77-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface IModelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModelFunctionsImpl implements IModelFunctionsImpl {

    public static final IModelFunctionsImpl INSTANCE = new ModelFunctionsImpl();

    private ModelFunctionsImpl() {}

  }
  
  public static class ModelFunctions {

    private ModelFunctions() {}

  }

  public static interface ITemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("96d10a22-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface ITemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TemplateFunctionsImpl implements ITemplateFunctionsImpl {

    public static final ITemplateFunctionsImpl INSTANCE = new TemplateFunctionsImpl();

    private TemplateFunctionsImpl() {}

  }
  
  public static class TemplateFunctions {

    private TemplateFunctions() {}

  }

  public static interface ISpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0ee34b5-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface ISpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SpecificationFunctionsImpl implements ISpecificationFunctionsImpl {

    public static final ISpecificationFunctionsImpl INSTANCE = new SpecificationFunctionsImpl();

    private SpecificationFunctionsImpl() {}

  }
  
  public static class SpecificationFunctions {

    private SpecificationFunctions() {}

  }

  public static interface IDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f6381a3f-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface IDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DiagramFunctionsImpl implements IDiagramFunctionsImpl {

    public static final IDiagramFunctionsImpl INSTANCE = new DiagramFunctionsImpl();

    private DiagramFunctionsImpl() {}

  }
  
  public static class DiagramFunctions {

    private DiagramFunctions() {}

  }

  public static interface IPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5fac0a17-8983-11e6-9315-e9960ca482c6")
    public List<cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IBuildingBlock> GetDependingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("40333452-c10a-11e6-8f58-ad3c6ee7602f")
    public List<cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin> GetDependingBuiltinBuildingBlocks();

    @IDynamicResourceExtension.MethodId("bd765b2f-c10b-11e6-8f58-ad3c6ee7602f")
    public List<cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin> GetAllDuplicatedBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("1e20244f-c10c-11e6-8f58-ad3c6ee7602f")
    public List<cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin> GetAllBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("3e2a64a5-5b56-11e7-9702-abdab196c2a1")
    public java.lang.String GetFullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("22956d62-5b57-11e7-9702-abdab196c2a1")
    public java.lang.Boolean UseSimpleName();

  }
  
  public static interface IPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("22956d62-5b57-11e7-9702-abdab196c2a1")
    public java.lang.Boolean UseSimpleName(final cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin plugin);

  }
  
  public static class PluginFunctionsImpl implements IPluginFunctionsImpl {

    public static final IPluginFunctionsImpl INSTANCE = new PluginFunctionsImpl();

    private PluginFunctionsImpl() {}

    @Override
    public java.lang.Boolean UseSimpleName(final cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin plugin) {
      /* Begin Protected Region [[22956d62-5b57-11e7-9702-abdab196c2a1]] */
    	Boolean useSimpleName = plugin.selectUseSimpleNameForBinding();
    	if( useSimpleName == null)
    	{
    		return false;
    	}
    	return useSimpleName;
      /* End Protected Region   [[22956d62-5b57-11e7-9702-abdab196c2a1]] */
    }

  }
  
  public static class PluginFunctions {

    private PluginFunctions() {}

    public static java.lang.Boolean UseSimpleName(final cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin plugin) {
      return DynamicResourceUtil.invoke(IPluginFunctionsImpl.class, PluginFunctionsImpl.INSTANCE, plugin).UseSimpleName(plugin);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7106baaa-3c77-11e6-aafa-bd565efc0ead,c+YkqRyeVNm+VcqB/L35cTS5ua4=] */
