package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Solutions extends DynamicResource implements ISolutions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutions>() {
    
    @Override
    public ISolutions create() {
      return new Solutions();
    }
    
    @Override
    public ISolutions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Solutions(resourceRepository, resource);
    }
  
  };

  public Solutions() {
    super(ISolutions.TYPE_ID);
  }
  
  public Solutions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutions.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer> selectDecompose() {
    return _getList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose);
  }

  public Solutions setDecompose(java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer> decompose) {
    _setList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Solutions setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_hasDependency);
  }

  public Solutions setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> hasDependency) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public Solutions setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public Solutions setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public Solutions setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Solutions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_hasDependency, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.javamodel.ISolutions selectToMeDecompose(cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel.IManufacturer object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.javamodel.ISolutions.class, cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view._05_solutionbuildingblock_viewPackage.Solutions_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6f6d790-4a7c-11e6-b2ea-f94c9b140b76,An9j8bPPrRn+iFcy3aoCsSTU2C4=] */
