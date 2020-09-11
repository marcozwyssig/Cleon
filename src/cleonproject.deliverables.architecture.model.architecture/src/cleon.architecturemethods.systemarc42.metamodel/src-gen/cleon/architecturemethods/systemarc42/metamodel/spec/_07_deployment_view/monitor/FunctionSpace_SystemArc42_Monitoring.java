package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.monitor;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3728d03d-d7b7-11ea-ae00-5518e944c256,imports]] */

/* End Protected Region   [[3728d03d-d7b7-11ea-ae00-5518e944c256,imports]] */

public class FunctionSpace_SystemArc42_Monitoring {

  /* Begin Protected Region [[3728d03d-d7b7-11ea-ae00-5518e944c256]] */
  
  /* End Protected Region   [[3728d03d-d7b7-11ea-ae00-5518e944c256]] */


  public static interface IMonitoringBuildingBlocksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("294ec342-c1f4-11ea-820f-9931558a898c")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> SelectMonitorBuildingBlocks();

  }
  
  public static interface IMonitoringBuildingBlocksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MonitoringBuildingBlocksFunctionsImpl implements IMonitoringBuildingBlocksFunctionsImpl {

    public static final IMonitoringBuildingBlocksFunctionsImpl INSTANCE = new MonitoringBuildingBlocksFunctionsImpl();

    private MonitoringBuildingBlocksFunctionsImpl() {}

  }
  
  public static class MonitoringBuildingBlocksFunctions {

    private MonitoringBuildingBlocksFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3728d03d-d7b7-11ea-ae00-5518e944c256,I8Uz+or6UTfidTHlwQrIoemDp84=] */