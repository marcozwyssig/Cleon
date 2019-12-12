package cleon.architecturemethods.arc42.spec.arc42;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[16226571-09c9-11e9-9915-0d353533f3da,imports]] */

/* End Protected Region   [[16226571-09c9-11e9-9915-0d353533f3da,imports]] */

public class FunctionSpace_Arc42 {

  /* Begin Protected Region [[16226571-09c9-11e9-9915-0d353533f3da]] */
  
  /* End Protected Region   [[16226571-09c9-11e9-9915-0d353533f3da]] */


  public static interface Iarc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("271a6bec-09c9-11e9-9915-0d353533f3da")
    public List<cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("a82f97f3-2ad6-11e9-b83f-8be423c00623")
    public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ISystem GetSystem();

    @IDynamicResourceExtension.MethodId("c9c2693d-2ad6-11e9-b83f-8be423c00623")
    public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.deployview.javamodel.IDeployView GetDeployment();

  }
  
  public static interface Iarc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class arc42DocumentFunctionsImpl implements Iarc42DocumentFunctionsImpl {

    public static final Iarc42DocumentFunctionsImpl INSTANCE = new arc42DocumentFunctionsImpl();

    private arc42DocumentFunctionsImpl() {}

  }
  
  public static class arc42DocumentFunctions {

    private arc42DocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,16226571-09c9-11e9-9915-0d353533f3da,59DNeVu4PHmYFq7J4n7zW9+eYFU=] */
