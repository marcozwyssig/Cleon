package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleActorResponsibility extends DynamicResource implements IRoleActorResponsibility {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleActorResponsibility> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleActorResponsibility>() {
    
    @Override
    public IRoleActorResponsibility create() {
      return new RoleActorResponsibility();
    }
    
    @Override
    public IRoleActorResponsibility create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleActorResponsibility(resourceRepository, resource);
    }
  
  };

  public RoleActorResponsibility() {
    super(IRoleActorResponsibility.TYPE_ID);
  }
  
  public RoleActorResponsibility(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleActorResponsibility.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public RoleActorResponsibility setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RoleActorResponsibility setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> selectGroups() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups);
  }

  public RoleActorResponsibility setGroups(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup> groups) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleActorResponsibility setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility selectResponsibility() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_responsibility);
  }

  public RoleActorResponsibility setResponsibility(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility responsibility) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_responsibility, responsibility);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent> selectRoles() {
    return _getMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_roles);
  }

  public RoleActorResponsibility setRoles(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent> roles) {
    _setMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleActorResponsibility setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleActorResponsibility setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IAbstractGroup.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.RbacPackage.AbstractGroups_groups, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_responsibility, visitor);
    _acceptMap(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorResponsibility selectToMeRoles(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorResponsibility.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_roles, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorResponsibility> selectToMeResponsibility(cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleActorResponsibility.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage.RoleActorResponsibility_responsibility, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb08ba17-809b-11e9-8e65-f3f639e40a34,cu7erZhes6OoAdNO89UOrWwcq9w=] */