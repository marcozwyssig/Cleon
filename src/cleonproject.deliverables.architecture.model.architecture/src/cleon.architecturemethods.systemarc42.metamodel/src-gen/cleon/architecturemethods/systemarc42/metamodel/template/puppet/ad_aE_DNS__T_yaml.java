package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[47530bae-111d-11ea-b1a8-559fc9dee05c,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.INamedHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.INumberedHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;

import java.util.ArrayList;

/* End Protected Region   [[47530bae-111d-11ea-b1a8-559fc9dee05c,imports]] */

public class ad_aE_DNS__T_yaml {

  /* Begin Protected Region [[47530bae-111d-11ea-b1a8-559fc9dee05c]] */

  /* End Protected Region   [[47530bae-111d-11ea-b1a8-559fc9dee05c]] */


  public static interface IHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52232d8b-14d8-11ea-a57d-f9a0d62ee07e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> Exclude();

  }
  
  public static interface IHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52232d8b-14d8-11ea-a57d-f9a0d62ee07e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> Exclude(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> hostNodeList);

  }
  
  public static class HostNodeFunctionsImpl implements IHostNodeFunctionsImpl {

    public static final IHostNodeFunctionsImpl INSTANCE = new HostNodeFunctionsImpl();

    private HostNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> Exclude(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> hostNodeList) {
      /* Begin Protected Region [[52232d8b-14d8-11ea-a57d-f9a0d62ee07e]] */
      final List<IHostNode> validNodes = new ArrayList<IHostNode>();
      for( final IHostNode hostNode : hostNodeList ) {
      	if( hostNode.selectExportDNSRecord() != null && !hostNode.selectExportDNSRecord().booleanValue()) {
      		continue;
      	}
      	final IAbstractHost node = hostNode.selectHost();
      	if( (node instanceof INumberedHost || node instanceof INamedHost) && node.selectInstanceOf().extension(ISystemConfigurationFunctions.class).DependsOnWindows()) {
      		continue;
      	}
      	validNodes.add(hostNode);
      }
      return validNodes;
      /* End Protected Region   [[52232d8b-14d8-11ea-a57d-f9a0d62ee07e]] */
    }

  }
  
  public static class HostNodeFunctions {

    private HostNodeFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> Exclude(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> hostNodeList) {
      return DynamicResourceUtil.invoke(IHostNodeFunctionsImpl.class, HostNodeFunctionsImpl.INSTANCE, hostNodeList).Exclude(hostNodeList);
    }

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7ae3dc62-ac1b-11eb-8ce4-4df2726518e8")
    public java.lang.String ReplacePointToUnderscore();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7ae3dc62-ac1b-11eb-8ce4-4df2726518e8")
    public java.lang.String ReplacePointToUnderscore(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String ReplacePointToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7ae3dc62-ac1b-11eb-8ce4-4df2726518e8]] */
      return stringLiteral.replace('.', '-');
      /* End Protected Region   [[7ae3dc62-ac1b-11eb-8ce4-4df2726518e8]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String ReplacePointToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).ReplacePointToUnderscore(stringLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,47530bae-111d-11ea-b1a8-559fc9dee05c,tl2VlGo+hP/vH9Cq+Ri+JelGNRM=] */
