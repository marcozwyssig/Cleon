package cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organisations extends DynamicResource implements IOrganisations {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisations> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisations>() {
    
    @Override
    public IOrganisations create() {
      return new Organisations();
    }
    
    @Override
    public IOrganisations create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organisations(resourceRepository, resource);
    }
  
  };

  public Organisations() {
    super(IOrganisations.TYPE_ID);
  }
  
  public Organisations(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisations.TYPE_ID);
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

  public Organisations setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation> selectOrganisations() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.OrganisationsPackage.Organisations_organisations);
  }

  public Organisations setOrganisations(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation> organisations) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.OrganisationsPackage.Organisations_organisations, organisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organisations setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.OrganisationsPackage.Organisations_organisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations selectToMeOrganisations(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.OrganisationsPackage.Organisations_organisations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b766ec40-c768-11e5-b3f9-43c5a0896ea1,YW1ZQXUKQVAWnxnk6jmWxaGghUs=] */