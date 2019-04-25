package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RBAC extends DynamicResource implements IRBAC {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRBAC>() {
    
    @Override
    public IRBAC create() {
      return new RBAC();
    }
    
    @Override
    public IRBAC create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RBAC(resourceRepository, resource);
    }
  
  };

  public RBAC() {
    super(IRBAC.TYPE_ID);
  }
  
  public RBAC(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRBAC.TYPE_ID);
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
  public ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivityGroups selectActivities() {
    return _getSingle(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivityGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_activities);
  }

  public RBAC setActivities(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivityGroups activities) {
    _setSingle(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_activities, activities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public RBAC setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RBAC setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RBAC setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups selectRoles() {
    return _getSingle(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_roles);
  }

  public RBAC setRoles(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups roles) {
    _setSingle(ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RBAC setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivityGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_activities, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRBAC selectToMeActivities(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IActivityGroups object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRBAC.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_activities, object.getResource());
  }
  
  public static ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRBAC selectToMeRoles(ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRoleGroups object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.security.rbac.javamodel.IRBAC.class, ikt.product.documentation.spec.concepts.security.rbac.RbacPackage.RBAC_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c337cfe-0eaf-11e9-9f19-6d15636f4ecc,6IarfeAAXZ5VlQkLjRP2ER+S0oY=] */