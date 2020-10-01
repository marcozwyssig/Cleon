package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AuthZBuildingBlockActivity extends DynamicResource implements IAuthZBuildingBlockActivity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockActivity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockActivity>() {
    
    @Override
    public IAuthZBuildingBlockActivity create() {
      return new AuthZBuildingBlockActivity();
    }
    
    @Override
    public IAuthZBuildingBlockActivity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AuthZBuildingBlockActivity(resourceRepository, resource);
    }
  
  };

  public AuthZBuildingBlockActivity() {
    super(IAuthZBuildingBlockActivity.TYPE_ID);
  }
  
  public AuthZBuildingBlockActivity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAuthZBuildingBlockActivity.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystem> selectAuthZForSystems() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockActivity_authZForSystems);
  }

  public AuthZBuildingBlockActivity setAuthZForSystems(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystem> authZForSystems) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockActivity_authZForSystems, authZForSystems);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public AuthZBuildingBlockActivity setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public AuthZBuildingBlockActivity setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public AuthZBuildingBlockActivity setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AuthZBuildingBlockActivity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockActivity_authZForSystems, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity selectToMeAuthZForSystems(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockActivity_authZForSystems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6dd2381d-03d6-11eb-9c97-71aa0c3a8a81,/EBe8h2VyrS1cgg8jCB0YXN+jyA=] */
