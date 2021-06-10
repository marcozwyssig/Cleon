package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapacityUsage extends DynamicResource implements ICapacityUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityUsage>() {
    
    @Override
    public ICapacityUsage create() {
      return new CapacityUsage();
    }
    
    @Override
    public ICapacityUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapacityUsage(resourceRepository, resource);
    }
  
  };

  public CapacityUsage() {
    super(ICapacityUsage.TYPE_ID);
  }
  
  public CapacityUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapacityUsage.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration selectMachineSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityUsage_machineSystemConfiguration);
  }

  public CapacityUsage setMachineSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration machineSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityUsage_machineSystemConfiguration, machineSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public CapacityUsage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapacityUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityUsage_machineSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityUsage> selectToMeMachineSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityUsage.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityUsage_machineSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df643bd9-a9a8-11eb-80cf-abd0e6d5d574,dh9LEOiEJUEe41kHdBbPXjQz7KQ=] */
