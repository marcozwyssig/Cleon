package cleon.uml.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentDecomposition extends DynamicResource implements IComponentDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentDecomposition>() {
    
    @Override
    public IComponentDecomposition create() {
      return new ComponentDecomposition();
    }
    
    @Override
    public IComponentDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentDecomposition(resourceRepository, resource);
    }
  
  };

  public ComponentDecomposition() {
    super(IComponentDecomposition.TYPE_ID);
  }
  
  public ComponentDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentDecomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public ComponentDecomposition setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.packages.javamodel.IPackage selectDecompose() {
    return _getSingle(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDecomposition_decompose);
  }

  public ComponentDecomposition setDecompose(cleon.uml.spec.structural.packages.javamodel.IPackage decompose) {
    _setSingle(cleon.uml.spec.structural.components.ComponentsPackage.ComponentDecomposition_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public ComponentDecomposition setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public ComponentDecomposition setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDecomposition_decompose, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.components.javamodel.IComponentDecomposition selectToMeDecompose(cleon.uml.spec.structural.packages.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.components.javamodel.IComponentDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDecomposition_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d4692e40-1755-11e5-9ca7-d1bb57b73459,hr9fM9IR/X2Z1RLXYhZlPiA0gN8=] */
