package cleon.architecturemethods.systemarc42.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorResponsibility;
/* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_Docbook_SystemArc42 {

  /* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */

  /* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */


  public static interface IAvailabilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6005307c-1e3a-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAvailabilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AvailabilityFunctionsImpl implements IAvailabilityFunctionsImpl {

    public static final IAvailabilityFunctionsImpl INSTANCE = new AvailabilityFunctionsImpl();

    private AvailabilityFunctionsImpl() {}

  }
  
  public static class AvailabilityFunctions {

    private AvailabilityFunctions() {}

  }

  public static interface IBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90698ca7-1e3f-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupFunctionsImpl implements IBackupFunctionsImpl {

    public static final IBackupFunctionsImpl INSTANCE = new BackupFunctionsImpl();

    private BackupFunctionsImpl() {}

  }
  
  public static class BackupFunctions {

    private BackupFunctions() {}

  }

  public static interface IDeploymentLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("13e4610e-0e2a-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentLevelFunctionsImpl implements IDeploymentLevelFunctionsImpl {

    public static final IDeploymentLevelFunctionsImpl INSTANCE = new DeploymentLevelFunctionsImpl();

    private DeploymentLevelFunctionsImpl() {}

  }
  
  public static class DeploymentLevelFunctions {

    private DeploymentLevelFunctions() {}

  }

  public static interface ISystemEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b4d3279-0e9e-11e9-9f19-6d15636f4ecc")
    public java.lang.String RenderChapters();

  }
  
  public static interface ISystemEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemEnvironmentFunctionsImpl implements ISystemEnvironmentFunctionsImpl {

    public static final ISystemEnvironmentFunctionsImpl INSTANCE = new SystemEnvironmentFunctionsImpl();

    private SystemEnvironmentFunctionsImpl() {}

  }
  
  public static class SystemEnvironmentFunctions {

    private SystemEnvironmentFunctions() {}

  }

  public static interface IDeployViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cccabf27-1983-11e9-88a0-1f786f12e4c1")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeployViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeployViewFunctionsImpl implements IDeployViewFunctionsImpl {

    public static final IDeployViewFunctionsImpl INSTANCE = new DeployViewFunctionsImpl();

    private DeployViewFunctionsImpl() {}

  }
  
  public static class DeployViewFunctions {

    private DeployViewFunctions() {}

  }

  public static interface IDeploymentDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52e6d461-199d-11e9-9d43-9ddad24f774b")
    public java.lang.String GetStandardDescription();

    @IDynamicResourceExtension.MethodId("b42c03d5-8551-11ea-a579-31bf00957a06")
    public java.lang.String RenderContent();

  }
  
  public static interface IDeploymentDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentDiagramFunctionsImpl implements IDeploymentDiagramFunctionsImpl {

    public static final IDeploymentDiagramFunctionsImpl INSTANCE = new DeploymentDiagramFunctionsImpl();

    private DeploymentDiagramFunctionsImpl() {}

  }
  
  public static class DeploymentDiagramFunctions {

    private DeploymentDiagramFunctions() {}

  }

  public static interface IQoSConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a62fb841-1d8d-11e9-b601-db75aa6f89a4")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IQoSConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QoSConceptFunctionsImpl implements IQoSConceptFunctionsImpl {

    public static final IQoSConceptFunctionsImpl INSTANCE = new QoSConceptFunctionsImpl();

    private QoSConceptFunctionsImpl() {}

  }
  
  public static class QoSConceptFunctions {

    private QoSConceptFunctions() {}

  }

  public static interface IActivitySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffcbe63a-1e15-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("8b15e7c2-61cd-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

  }
  
  public static interface IActivitySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8b15e7c2-61cd-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration);

  }
  
  public static class ActivitySystemConfigurationFunctionsImpl implements IActivitySystemConfigurationFunctionsImpl {

    public static final IActivitySystemConfigurationFunctionsImpl INSTANCE = new ActivitySystemConfigurationFunctionsImpl();

    private ActivitySystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration) {
      return null;
    }

  }
  
  public static class ActivitySystemConfigurationFunctions {

    private ActivitySystemConfigurationFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration activitySystemConfiguration) {
      return DynamicResourceUtil.invoke(IActivitySystemConfigurationFunctionsImpl.class, ActivitySystemConfigurationFunctionsImpl.INSTANCE, activitySystemConfiguration).RenderChapters(activitySystemConfiguration);
    }

  }

  public static interface IActivityRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8fcdfb48-1e18-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IActivityRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityRootGroupsFunctionsImpl implements IActivityRootGroupsFunctionsImpl {

    public static final IActivityRootGroupsFunctionsImpl INSTANCE = new ActivityRootGroupsFunctionsImpl();

    private ActivityRootGroupsFunctionsImpl() {}

  }
  
  public static class ActivityRootGroupsFunctions {

    private ActivityRootGroupsFunctions() {}

  }

  public static interface IRoleActorGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa35cae7-1e1b-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("2f696a13-61d4-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters();

    @IDynamicResourceExtension.MethodId("0a09741d-6e97-11ea-b8e8-f1a46e0c42f7")
    public java.lang.Integer Count();

  }
  
  public static interface IRoleActorGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2f696a13-61d4-11ea-b3a7-2dbb30740ced")
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup);

    @IDynamicResourceExtension.MethodId("0a09741d-6e97-11ea-b8e8-f1a46e0c42f7")
    public java.lang.Integer Count(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup);

  }
  
  public static class RoleActorGroupFunctionsImpl implements IRoleActorGroupFunctionsImpl {

    public static final IRoleActorGroupFunctionsImpl INSTANCE = new RoleActorGroupFunctionsImpl();

    private RoleActorGroupFunctionsImpl() {}

    @Override
    public java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup) {
      return null;
    }

    @Override
    public java.lang.Integer Count(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup) {
      /* Begin Protected Region [[0a09741d-6e97-11ea-b8e8-f1a46e0c42f7]] */
      int count = 0;
      for(final IRoleActorResponsibility actorResponsibility : roleActorGroup.selectRoleActorResponsibilities().values()) {
      	count += actorResponsibility.selectRolesForSystemComponents().size();
      }
      return count;  
      /* End Protected Region   [[0a09741d-6e97-11ea-b8e8-f1a46e0c42f7]] */
    }

  }
  
  public static class RoleActorGroupFunctions {

    private RoleActorGroupFunctions() {}

    public static java.lang.String RenderChapters(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup) {
      return DynamicResourceUtil.invoke(IRoleActorGroupFunctionsImpl.class, RoleActorGroupFunctionsImpl.INSTANCE, roleActorGroup).RenderChapters(roleActorGroup);
    }

    public static java.lang.Integer Count(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleActorGroup roleActorGroup) {
      return DynamicResourceUtil.invoke(IRoleActorGroupFunctionsImpl.class, RoleActorGroupFunctionsImpl.INSTANCE, roleActorGroup).Count(roleActorGroup);
    }

  }

  public static interface IRoleRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0093bca4-1e1c-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRoleRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleRootGroupsFunctionsImpl implements IRoleRootGroupsFunctionsImpl {

    public static final IRoleRootGroupsFunctionsImpl INSTANCE = new RoleRootGroupsFunctionsImpl();

    private RoleRootGroupsFunctionsImpl() {}

  }
  
  public static class RoleRootGroupsFunctions {

    private RoleRootGroupsFunctions() {}

  }

  public static interface IDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5de412e9-6df3-11ea-ab3c-05911d3796c8")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinationFunctionsImpl implements IDestinationFunctionsImpl {

    public static final IDestinationFunctionsImpl INSTANCE = new DestinationFunctionsImpl();

    private DestinationFunctionsImpl() {}

  }
  
  public static class DestinationFunctions {

    private DestinationFunctions() {}

  }

  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99621024-6e6e-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderChapters();

    @IDynamicResourceExtension.MethodId("4047d49d-0d1e-11e9-be4f-03130cc057ef")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ZoneFunctionsImpl implements IZoneFunctionsImpl {

    public static final IZoneFunctionsImpl INSTANCE = new ZoneFunctionsImpl();

    private ZoneFunctionsImpl() {}

  }
  
  public static class ZoneFunctions {

    private ZoneFunctions() {}

  }

  public static interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("765c9a86-6e84-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

  }

  public static interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e732d10-6e87-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderChapters();

  }
  
  public static interface IAbstractLogicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractLogicalNetworkFunctionsImpl implements IAbstractLogicalNetworkFunctionsImpl {

    public static final IAbstractLogicalNetworkFunctionsImpl INSTANCE = new AbstractLogicalNetworkFunctionsImpl();

    private AbstractLogicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractLogicalNetworkFunctions {

    private AbstractLogicalNetworkFunctions() {}

  }

  public static interface IRBACFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("acf274f1-6e93-11ea-b8e8-f1a46e0c42f7")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IRBACFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RBACFunctionsImpl implements IRBACFunctionsImpl {

    public static final IRBACFunctionsImpl INSTANCE = new RBACFunctionsImpl();

    private RBACFunctionsImpl() {}

  }
  
  public static class RBACFunctions {

    private RBACFunctions() {}

  }

  public static interface IAbstractSiteGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ebcf47f-6e95-11ea-b8e8-f1a46e0c42f7")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractSiteGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteGroupFunctionsImpl implements IAbstractSiteGroupFunctionsImpl {

    public static final IAbstractSiteGroupFunctionsImpl INSTANCE = new AbstractSiteGroupFunctionsImpl();

    private AbstractSiteGroupFunctionsImpl() {}

  }
  
  public static class AbstractSiteGroupFunctions {

    private AbstractSiteGroupFunctions() {}

  }

  public static interface ISourceSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e8e78fbc-d1a5-11ea-aaa2-e3554b4f77be")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISourceSubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceSubZoneFunctionsImpl implements ISourceSubZoneFunctionsImpl {

    public static final ISourceSubZoneFunctionsImpl INSTANCE = new SourceSubZoneFunctionsImpl();

    private SourceSubZoneFunctionsImpl() {}

  }
  
  public static class SourceSubZoneFunctions {

    private SourceSubZoneFunctions() {}

  }

  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70ffa98d-d1aa-11ea-aaa2-e3554b4f77be")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

  }

  public static interface IServiceAccountEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cf0e7bcd-d1b5-11ea-aaa2-e3554b4f77be")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IServiceAccountEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountEnvironmentFunctionsImpl implements IServiceAccountEnvironmentFunctionsImpl {

    public static final IServiceAccountEnvironmentFunctionsImpl INSTANCE = new ServiceAccountEnvironmentFunctionsImpl();

    private ServiceAccountEnvironmentFunctionsImpl() {}

  }
  
  public static class ServiceAccountEnvironmentFunctions {

    private ServiceAccountEnvironmentFunctions() {}

  }

  public static interface IWhiteboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17d0424a-d7dd-11ea-ae00-5518e944c256")
    public java.lang.String RenderAdditionalChapters();

    @IDynamicResourceExtension.MethodId("457549ba-d7dd-11ea-ae00-5518e944c256")
    public java.lang.String RenderNetworkSegmentation();

  }
  
  public static interface IWhiteboxFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WhiteboxFunctionsImpl implements IWhiteboxFunctionsImpl {

    public static final IWhiteboxFunctionsImpl INSTANCE = new WhiteboxFunctionsImpl();

    private WhiteboxFunctionsImpl() {}

  }
  
  public static class WhiteboxFunctions {

    private WhiteboxFunctions() {}

  }

  public static interface IRealmForSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b01db1fa-fd92-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmForSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmForSystemConfigurationFunctionsImpl implements IRealmForSystemConfigurationFunctionsImpl {

    public static final IRealmForSystemConfigurationFunctionsImpl INSTANCE = new RealmForSystemConfigurationFunctionsImpl();

    private RealmForSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RealmForSystemConfigurationFunctions {

    private RealmForSystemConfigurationFunctions() {}

  }

  public static interface IAbstractRealmForDependentSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c93a7167-fd9b-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractRealmForDependentSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractRealmForDependentSystemConfigurationFunctionsImpl implements IAbstractRealmForDependentSystemConfigurationFunctionsImpl {

    public static final IAbstractRealmForDependentSystemConfigurationFunctionsImpl INSTANCE = new AbstractRealmForDependentSystemConfigurationFunctionsImpl();

    private AbstractRealmForDependentSystemConfigurationFunctionsImpl() {}

  }
  
  public static class AbstractRealmForDependentSystemConfigurationFunctions {

    private AbstractRealmForDependentSystemConfigurationFunctions() {}

  }

  public static interface IRealmBasedOnDependentSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e1c2a7c8-fd9b-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmBasedOnDependentSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmBasedOnDependentSystemConfigurationFunctionsImpl implements IRealmBasedOnDependentSystemConfigurationFunctionsImpl {

    public static final IRealmBasedOnDependentSystemConfigurationFunctionsImpl INSTANCE = new RealmBasedOnDependentSystemConfigurationFunctionsImpl();

    private RealmBasedOnDependentSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RealmBasedOnDependentSystemConfigurationFunctions {

    private RealmBasedOnDependentSystemConfigurationFunctions() {}

  }

  public static interface IRealmUsageForDependentSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("27b99338-fd9c-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmUsageForDependentSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmUsageForDependentSystemConfigurationFunctionsImpl implements IRealmUsageForDependentSystemConfigurationFunctionsImpl {

    public static final IRealmUsageForDependentSystemConfigurationFunctionsImpl INSTANCE = new RealmUsageForDependentSystemConfigurationFunctionsImpl();

    private RealmUsageForDependentSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RealmUsageForDependentSystemConfigurationFunctions {

    private RealmUsageForDependentSystemConfigurationFunctions() {}

  }

  public static interface IRealmConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6a53ed4a-fd99-11ea-aa08-3550db97e5ec")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRealmConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RealmConceptFunctionsImpl implements IRealmConceptFunctionsImpl {

    public static final IRealmConceptFunctionsImpl INSTANCE = new RealmConceptFunctionsImpl();

    private RealmConceptFunctionsImpl() {}

  }
  
  public static class RealmConceptFunctions {

    private RealmConceptFunctions() {}

  }

  public static interface IRealmConfigurationUsageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f425a8b-fd9e-11ea-aa08-3550db97e5ec")
    public java.lang.String Text();

  }
  
  public static interface IRealmConfigurationUsageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f425a8b-fd9e-11ea-aa08-3550db97e5ec")
    public java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage realmConfigurationUsage);

  }
  
  public static class RealmConfigurationUsageFunctionsImpl implements IRealmConfigurationUsageFunctionsImpl {

    public static final IRealmConfigurationUsageFunctionsImpl INSTANCE = new RealmConfigurationUsageFunctionsImpl();

    private RealmConfigurationUsageFunctionsImpl() {}

    @Override
    public java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage realmConfigurationUsage) {
      /* Begin Protected Region [[4f425a8b-fd9e-11ea-aa08-3550db97e5ec]] */
      if( realmConfigurationUsage.selectDescriptions().isEmpty()) {
      	return String.join("\n", realmConfigurationUsage.selectDirectoryService().selectMandatoryDescriptions());
      }
      return  String.join("\n", realmConfigurationUsage.selectDirectoryService().selectStandardDescription());
      /* End Protected Region   [[4f425a8b-fd9e-11ea-aa08-3550db97e5ec]] */
    }

  }
  
  public static class RealmConfigurationUsageFunctions {

    private RealmConfigurationUsageFunctions() {}

    public static java.lang.String Text(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IRealmConfigurationUsage realmConfigurationUsage) {
      return DynamicResourceUtil.invoke(IRealmConfigurationUsageFunctionsImpl.class, RealmConfigurationUsageFunctionsImpl.INSTANCE, realmConfigurationUsage).Text(realmConfigurationUsage);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fb58b09d-d181-11e8-b18f-df1540bb7a5c,2tkInVerwcFrZ3TCssL9ri8atcM=] */
