package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestComponent extends DynamicResource implements ITestComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestComponent>() {
    
    @Override
    public ITestComponent create() {
      return new TestComponent();
    }
    
    @Override
    public ITestComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestComponent(resourceRepository, resource);
    }
  
  };

  public TestComponent() {
    super(ITestComponent.TYPE_ID);
  }
  
  public TestComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestComponent.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.document.DocumentPackage.Document_chapters);
  }

  public TestComponent setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.tdd.spec.javamodel.ITestComponentDependency selectComponentUnderTest() {
    return _getSingle(cleon.tdd.spec.javamodel.ITestComponentDependency.class, cleon.tdd.spec.SpecPackage.TestComponent_componentUnderTest);
  }

  public TestComponent setComponentUnderTest(cleon.tdd.spec.javamodel.ITestComponentDependency componentUnderTest) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestComponent_componentUnderTest, componentUnderTest);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public TestComponent setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public TestComponent setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_hasDependency);
  }

  public TestComponent setHasDependency(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.Component_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public TestComponent setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_packages);
  }

  public TestComponent setPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> packages) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.Component_packages, packages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.document.DocumentPackage.Document_paragraphes);
  }

  public TestComponent setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestPackageDecomposition> selectTestPackages() {
    return _getMap(cleon.tdd.spec.javamodel.ITestPackageDecomposition.class, cleon.tdd.spec.SpecPackage.TestComponent_testPackages);
  }

  public TestComponent setTestPackages(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestPackageDecomposition> testPackages) {
    _setMap(cleon.tdd.spec.SpecPackage.TestComponent_testPackages, testPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public TestComponent setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.components.ComponentsPackage.AbstractComponent_shortName, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.document.DocumentPackage.Document_chapters, visitor);
    _acceptSingle(cleon.tdd.spec.javamodel.ITestComponentDependency.class, cleon.tdd.spec.SpecPackage.TestComponent_componentUnderTest, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_hasDependency, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition.class, cleon.uml.spec.structural.components.ComponentsPackage.Component_packages, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.document.DocumentPackage.Document_paragraphes, visitor);
    _acceptMap(cleon.tdd.spec.javamodel.ITestPackageDecomposition.class, cleon.tdd.spec.SpecPackage.TestComponent_testPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.tdd.spec.javamodel.ITestComponent selectToMeTestPackages(cleon.tdd.spec.javamodel.ITestPackageDecomposition object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestComponent.class, cleon.tdd.spec.SpecPackage.TestComponent_testPackages, object.getResource());
  }
  
  public static cleon.tdd.spec.javamodel.ITestComponent selectToMeComponentUnderTest(cleon.tdd.spec.javamodel.ITestComponentDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.tdd.spec.javamodel.ITestComponent.class, cleon.tdd.spec.SpecPackage.TestComponent_componentUnderTest, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a5ae6ce6-df47-11e2-b229-cd1bd4a07953,9cP9/vULDxe84J9J3TZ+MEmNtL4=] */
