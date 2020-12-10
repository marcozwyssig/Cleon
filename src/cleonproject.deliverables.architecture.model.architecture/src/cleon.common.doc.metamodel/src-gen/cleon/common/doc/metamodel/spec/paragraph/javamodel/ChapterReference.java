package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ChapterReference extends DynamicResource implements IChapterReference {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChapterReference> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChapterReference>() {
    
    @Override
    public IChapterReference create() {
      return new ChapterReference();
    }
    
    @Override
    public IChapterReference create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ChapterReference(resourceRepository, resource);
    }
  
  };

  public ChapterReference() {
    super(IChapterReference.TYPE_ID);
  }
  
  public ChapterReference(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChapterReference.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_text, text);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectChapter() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapter);
  }

  public ChapterReference setChapter(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter chapter) {
    _setSingle(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapter, chapter);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public ChapterReference setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ChapterReference setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_text, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapter, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.common.doc.metamodel.spec.paragraph.javamodel.IChapterReference> selectToMeChapter(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.metamodel.spec.paragraph.javamodel.IChapterReference.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapter, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,56be6ccf-dbc2-11ea-b71c-ade06d3dafe4,02ro2Yqrrw+fhwV95tpewIbx13k=] */
