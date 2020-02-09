package cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class RootNode extends DynamicResource implements IRootNode {

  // abstract implementation, only used for static method calls
  private RootNode() {
    super(IRootNode.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel.IRootNode selectToMeBuildNodes(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel.IRootNode.class, cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.NodePackage.RootNode_buildNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a632f40c-02d4-11e9-9e58-33d596257b14,Gmb8cI4XQFBSa4tXexmTE09PCPo=] */