package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SupplySiteNode extends DynamicResource implements ISupplySiteNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplySiteNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplySiteNode>() {
    
    @Override
    public ISupplySiteNode create() {
      return new SupplySiteNode();
    }
    
    @Override
    public ISupplySiteNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SupplySiteNode(resourceRepository, resource);
    }
  
  };

  public SupplySiteNode() {
    super(ISupplySiteNode.TYPE_ID);
  }
  
  public SupplySiteNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupplySiteNode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes);
  }

  public SupplySiteNode setBuildNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.Node_nodes);
  }

  public SupplySiteNode setNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite selectSite() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySiteNode_site);
  }

  public SupplySiteNode setSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite site) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySiteNode_site, site);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public SupplySiteNode setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SupplySiteNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySiteNode_site, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplySiteNode selectToMeSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplySiteNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.SupplynodePackage.SupplySiteNode_site, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0674e77a-0aaf-11e9-a8f9-abf1763bbc53,ZblbYioOfTJcGNSO+6GcmZi9lfE=] */
