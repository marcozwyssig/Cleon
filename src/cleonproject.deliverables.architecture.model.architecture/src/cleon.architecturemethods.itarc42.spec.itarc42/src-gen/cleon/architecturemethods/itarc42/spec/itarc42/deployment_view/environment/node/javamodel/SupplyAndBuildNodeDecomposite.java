package cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SupplyAndBuildNodeDecomposite extends DynamicResource implements ISupplyAndBuildNodeDecomposite {

  // abstract implementation, only used for static method calls
  private SupplyAndBuildNodeDecomposite() {
    super(ISupplyAndBuildNodeDecomposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite selectToMeSuppliedNodes(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite selectToMeBuildNodes(cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_buildNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4f4fc335-ef41-11e8-be8a-b748ff8f0a75,0EhI7f279TkEC607X7ZOJ8gMznM=] */
