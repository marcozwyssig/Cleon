package cleon.support.projectmanagement.spec.resource.teams.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Team extends DynamicResource implements ITeam {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITeam> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITeam>() {
    
    @Override
    public ITeam create() {
      return new Team();
    }
    
    @Override
    public ITeam create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Team(resourceRepository, resource);
    }
  
  };

  public Team() {
    super(ITeam.TYPE_ID);
  }
  
  public Team(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITeam.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Team setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> selectPersons() {
    return _getList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.resource.teams.TeamsPackage.Team_persons);
  }

  public Team setPersons(java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> persons) {
    _setList(cleon.support.projectmanagement.spec.resource.teams.TeamsPackage.Team_persons, persons);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Team setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.resource.teams.TeamsPackage.Team_persons, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam> selectToMePersons(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam.class, cleon.support.projectmanagement.spec.resource.teams.TeamsPackage.Team_persons, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7303e9c7-2eea-11e6-8bd9-a77b8d2a3a0e,T5XKUnYTCFkwUfZITsnFZTWhon0=] */