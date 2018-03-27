package cleon.conception.architecture.spec.uml.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EventForField extends DynamicResource implements IEventForField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventForField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEventForField>() {
    
    @Override
    public IEventForField create() {
      return new EventForField();
    }
    
    @Override
    public IEventForField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EventForField(resourceRepository, resource);
    }
  
  };

  public EventForField() {
    super(IEventForField.TYPE_ID);
  }
  
  public EventForField(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEventForField.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public EventForField setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField selectTarget() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.architecture.spec.uml.structural.classes.events.EventsPackage.EventForField_target);
  }

  public EventForField setTarget(cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField target) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.classes.events.EventsPackage.EventForField_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EventForField setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.architecture.spec.uml.structural.classes.events.EventsPackage.EventForField_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField> selectToMeTarget(cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField.class, cleon.conception.architecture.spec.uml.structural.classes.events.EventsPackage.EventForField_target, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1b6f35fa-7fc7-11e4-842a-1924f269f20b,T5mPhsf0v7ZonMYewzOykiE4adM=] */