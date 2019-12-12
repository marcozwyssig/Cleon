package cleon.common.doc.doc.spec.chapter.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Distinction extends DynamicResource implements IDistinction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinction>() {
    
    @Override
    public IDistinction create() {
      return new Distinction();
    }
    
    @Override
    public IDistinction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Distinction(resourceRepository, resource);
    }
  
  };

  public Distinction() {
    super(IDistinction.TYPE_ID);
  }
  
  public Distinction(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDistinction.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IChapter.class, cleon.common.doc.doc.spec.SpecPackage.OnlyStandardElementsChapter_chapters);
  }

  public Distinction setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.OnlyStandardElementsChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Distinction setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IStandardParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.doc.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs);
  }

  public Distinction setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IStandardParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Distinction setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IChapter.class, cleon.common.doc.doc.spec.SpecPackage.OnlyStandardElementsChapter_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.doc.spec.SpecPackage.OnlyStandardElementsChapter_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8a2f1c8-0784-11e9-99e7-97cc29f85ed6,Wta+3r4+44kT51xVW47YN279a2A=] */