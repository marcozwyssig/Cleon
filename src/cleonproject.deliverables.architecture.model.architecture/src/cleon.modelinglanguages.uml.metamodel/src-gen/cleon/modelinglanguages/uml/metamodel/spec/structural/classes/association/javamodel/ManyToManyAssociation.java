package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManyToManyAssociation extends DynamicResource implements IManyToManyAssociation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManyToManyAssociation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManyToManyAssociation>() {
    
    @Override
    public IManyToManyAssociation create() {
      return new ManyToManyAssociation();
    }
    
    @Override
    public IManyToManyAssociation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManyToManyAssociation(resourceRepository, resource);
    }
  
  };

  public ManyToManyAssociation() {
    super(IManyToManyAssociation.TYPE_ID);
  }
  
  public ManyToManyAssociation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManyToManyAssociation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.lang.String selectDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_description);
  }
    
  public void setDescription(java.lang.String description) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_description, description);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.Boolean selectObjectNavigationable() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectNavigationable);
  }
    
  public void setObjectNavigationable(java.lang.Boolean objectNavigationable) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectNavigationable, objectNavigationable);
  }

  @Override
  public java.lang.Boolean selectObjectReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectReadOnly);
  }
    
  public void setObjectReadOnly(java.lang.Boolean objectReadOnly) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectReadOnly, objectReadOnly);
  }

  @Override
  public java.lang.String selectObjectRoleName() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectRoleName);
  }
    
  public void setObjectRoleName(java.lang.String objectRoleName) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectRoleName, objectRoleName);
  }

  @Override
  public java.lang.Boolean selectSubjectReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_subjectReadOnly);
  }
    
  public void setSubjectReadOnly(java.lang.Boolean subjectReadOnly) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_subjectReadOnly, subjectReadOnly);
  }

  @Override
  public java.lang.String selectSubjectRoleName() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_subjectRoleName);
  }
    
  public void setSubjectRoleName(java.lang.String subjectRoleName) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_subjectRoleName, subjectRoleName);
  }

  @Override
  public java.lang.Boolean selectSuppressAutoProperty() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_suppressAutoProperty);
  }
    
  public void setSuppressAutoProperty(java.lang.Boolean suppressAutoProperty) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_suppressAutoProperty, suppressAutoProperty);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociationType selectAssocationType() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociationType.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_assocationType);
  }

  public ManyToManyAssociation setAssocationType(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociationType assocationType) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_assocationType, assocationType);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType selectCollectionType() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType);
  }

  public ManyToManyAssociation setCollectionType(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType collectionType) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType, collectionType);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_to);
  }

  public ManyToManyAssociation setTo(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier to) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManyToManyAssociation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_description, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectNavigationable, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectReadOnly, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_objectRoleName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_subjectReadOnly, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_subjectRoleName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_suppressAutoProperty, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociationType.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_assocationType, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.Association_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f0515d32-2783-11e3-a466-eda9d7258bca,PzFxGjL/6px+z8C2N2QMNhW9Ytw=] */
