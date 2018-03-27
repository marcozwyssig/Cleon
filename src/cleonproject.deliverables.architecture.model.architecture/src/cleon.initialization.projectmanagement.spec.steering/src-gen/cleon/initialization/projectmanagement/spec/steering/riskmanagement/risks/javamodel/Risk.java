package cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Risk extends DynamicResource implements IRisk {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRisk> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRisk>() {
    
    @Override
    public IRisk create() {
      return new Risk();
    }
    
    @Override
    public IRisk create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Risk(resourceRepository, resource);
    }
  
  };

  public Risk() {
    super(IRisk.TYPE_ID);
  }
  
  public Risk(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRisk.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
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
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEntryDate() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_entryDate);
  }

  public Risk setEntryDate(cleon.common.resources.spec.calendar.javamodel.IDay entryDate) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_entryDate, entryDate);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.impactarea.javamodel.IImpactType selectImpactType() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.impactarea.javamodel.IImpactType.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_impactType);
  }

  public Risk setImpactType(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.impactarea.javamodel.IImpactType impactType) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_impactType, impactType);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public Risk setOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskState selectRiskState() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskState.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_riskState);
  }

  public Risk setRiskState(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskState riskState) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_riskState, riskState);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskType selectType() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskType.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_type);
  }

  public Risk setType(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskType type) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Risk setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_entryDate, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.impactarea.javamodel.IImpactType.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_impactType, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskState.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_riskState, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskType.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk> selectToMeEntryDate(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_entryDate, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk> selectToMeImpactType(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.impactarea.javamodel.IImpactType object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_impactType, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk> selectToMeRiskState(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskState object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_riskState, object.getResource());
  }
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk> selectToMeType(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRiskType object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk.class, cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.RisksPackage.Risk_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,70f3fadf-2efd-11e6-8bd9-a77b8d2a3a0e,ILkbf8y3GE6HryKMrEDnZ2mCIiE=] */
