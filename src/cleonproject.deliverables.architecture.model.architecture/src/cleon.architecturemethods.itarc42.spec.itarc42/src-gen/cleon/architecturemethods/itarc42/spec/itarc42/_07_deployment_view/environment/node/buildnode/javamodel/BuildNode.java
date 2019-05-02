package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildNode extends DynamicResource implements IBuildNode {

  // abstract implementation, only used for static method calls
  private BuildNode() {
    super(IBuildNode.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectToMeSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_systemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode selectToMeBuildNodes(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectToMeProductVariants(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode selectToMeCpu(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode selectToMeMemory(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode selectToMeDisk(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,853a8e37-ef41-11e8-be8a-b748ff8f0a75,2868n2mAtGqGPA+EAOpOLLicCRE=] */