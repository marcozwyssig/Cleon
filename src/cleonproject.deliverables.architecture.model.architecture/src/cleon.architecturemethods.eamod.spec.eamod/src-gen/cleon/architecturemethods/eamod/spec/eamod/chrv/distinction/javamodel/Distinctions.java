package cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Distinctions extends DynamicResource implements IDistinctions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinctions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinctions>() {
    
    @Override
    public IDistinctions create() {
      return new Distinctions();
    }
    
    @Override
    public IDistinctions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Distinctions(resourceRepository, resource);
    }
  
  };

  public Distinctions() {
    super(IDistinctions.TYPE_ID);
  }
  
  public Distinctions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDistinctions.TYPE_ID);
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

  public Distinctions setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Distinctions setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes selectOutofscope() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_outofscope);
  }

  public Distinctions setOutofscope(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes outofscope) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_outofscope, outofscope);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Distinctions setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies selectSupply() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_supply);
  }

  public Distinctions setSupply(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies supply) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_supply, supply);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Distinctions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_outofscope, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_supply, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions selectToMeOutofscope(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_outofscope, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions selectToMeSupply(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions.class, cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.DistinctionPackage.Distinctions_supply, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e94265a9-0e1a-11e6-ae01-ef640c578b9b,8DGBXdtySU9NohGo0rXHS8Hqas0=] */
