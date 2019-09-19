package cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Distribution extends DynamicResource implements IDistribution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistribution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistribution>() {
    
    @Override
    public IDistribution create() {
      return new Distribution();
    }
    
    @Override
    public IDistribution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Distribution(resourceRepository, resource);
    }
  
  };

  public Distribution() {
    super(IDistribution.TYPE_ID);
  }
  
  public Distribution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDistribution.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IFulfillment selectFulfillment() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IFulfillment.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_fulfillment);
  }

  public Distribution setFulfillment(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IFulfillment fulfillment) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_fulfillment, fulfillment);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPreSales selectPreSales() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPreSales.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_preSales);
  }

  public Distribution setPreSales(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPreSales preSales) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_preSales, preSales);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IProduction selectProduction() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IProduction.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_production);
  }

  public Distribution setProduction(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IProduction production) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_production, production);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPurchase selectPurchase() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPurchase.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_purchase);
  }

  public Distribution setPurchase(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPurchase purchase) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_purchase, purchase);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Distribution setResponsible(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Distribution setStaff(java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.javamodel.IOrganisationUnit.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Distribution setSubOrganisations(java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Distribution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IFulfillment.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_fulfillment, visitor);
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPreSales.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_preSales, visitor);
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IProduction.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_production, visitor);
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPurchase.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_purchase, visitor);
    _acceptSingle(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution selectToMePreSales(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPreSales object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_preSales, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution selectToMeFulfillment(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IFulfillment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_fulfillment, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution selectToMePurchase(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IPurchase object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_purchase, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution selectToMeProduction(cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IProduction object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution.class, cleon.architecturemethods.org42.spec.epm.unit.keyprocess.distribution.DistributionPackage.Distribution_production, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7546c5a9-daa8-11e3-ae07-89aa80d5ec3d,L6EcT/wuos0+p5wRpC0Bu90wxao=] */
