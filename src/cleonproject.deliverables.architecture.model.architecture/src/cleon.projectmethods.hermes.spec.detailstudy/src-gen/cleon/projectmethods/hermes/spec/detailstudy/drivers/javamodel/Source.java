package cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Source extends DynamicResource implements ISource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISource>() {
    
    @Override
    public ISource create() {
      return new Source();
    }
    
    @Override
    public ISource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Source(resourceRepository, resource);
    }
  
  };

  public Source() {
    super(ISource.TYPE_ID);
  }
  
  public Source(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISource.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public Source setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Source setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Source setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Source setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a5a90ca0-3c14-11e5-9962-cf3035adb922,Z+h8e0pCSK+PCGgtLWOyj9/2agY=] */
