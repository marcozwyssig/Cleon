package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OsExecutionEnvironmentBuildNode extends DynamicResource implements IOsExecutionEnvironmentBuildNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOsExecutionEnvironmentBuildNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOsExecutionEnvironmentBuildNode>() {
    
    @Override
    public IOsExecutionEnvironmentBuildNode create() {
      return new OsExecutionEnvironmentBuildNode();
    }
    
    @Override
    public IOsExecutionEnvironmentBuildNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OsExecutionEnvironmentBuildNode(resourceRepository, resource);
    }
  
  };

  public OsExecutionEnvironmentBuildNode() {
    super(IOsExecutionEnvironmentBuildNode.TYPE_ID);
  }
  
  public OsExecutionEnvironmentBuildNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOsExecutionEnvironmentBuildNode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

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
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes);
  }

  public OsExecutionEnvironmentBuildNode setBuildNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectCpu() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu);
  }

  public OsExecutionEnvironmentBuildNode setCpu(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> cpu) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, cpu);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectDisk() {
    return _getMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk);
  }

  public OsExecutionEnvironmentBuildNode setDisk(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> disk) {
    _setMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk, disk);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectInstanceOf() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf);
  }

  public OsExecutionEnvironmentBuildNode setInstanceOf(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration instanceOf) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf, instanceOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectMemory() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory);
  }

  public OsExecutionEnvironmentBuildNode setMemory(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> memory) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory, memory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.Node_nodes);
  }

  public OsExecutionEnvironmentBuildNode setNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> selectProductVariants() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants);
  }

  public OsExecutionEnvironmentBuildNode setProductVariants(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> productVariants) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, productVariants);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IRuntime selectRuntime() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IRuntime.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.OsExecutionEnvironmentBuildNode_runtime);
  }

  public OsExecutionEnvironmentBuildNode setRuntime(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IRuntime runtime) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.OsExecutionEnvironmentBuildNode_runtime, runtime);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public OsExecutionEnvironmentBuildNode setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public OsExecutionEnvironmentBuildNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OsExecutionEnvironmentBuildNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_buildNodes, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_cpu, visitor);
    _acceptMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_disk, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_instanceOf, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_memory, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.BuildNode_productVariants, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IRuntime.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.OsExecutionEnvironmentBuildNode_runtime, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IOsExecutionEnvironmentBuildNode> selectToMeRuntime(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IRuntime object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IOsExecutionEnvironmentBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.BuildnodePackage.OsExecutionEnvironmentBuildNode_runtime, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0a438c62-01ec-11ea-bd6c-dd6cdcfeff45,/vhmra1+aMG142GR3kE5iF2ZDNw=] */