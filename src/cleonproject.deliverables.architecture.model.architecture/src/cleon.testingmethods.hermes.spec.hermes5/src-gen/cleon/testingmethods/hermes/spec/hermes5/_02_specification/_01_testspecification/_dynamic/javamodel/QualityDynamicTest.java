package cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QualityDynamicTest extends DynamicResource implements IQualityDynamicTest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityDynamicTest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityDynamicTest>() {
    
    @Override
    public IQualityDynamicTest create() {
      return new QualityDynamicTest();
    }
    
    @Override
    public IQualityDynamicTest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QualityDynamicTest(resourceRepository, resource);
    }
  
  };

  public QualityDynamicTest() {
    super(IQualityDynamicTest.TYPE_ID);
  }
  
  public QualityDynamicTest(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQualityDynamicTest.TYPE_ID);
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
  public java.lang.String selectExpectedResult() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_expectedResult);
  }
    
  public void setExpectedResult(java.lang.String expectedResult) {
     _setSingleAttribute(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_expectedResult, expectedResult);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_chapters);
  }

  public QualityDynamicTest setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public QualityDynamicTest setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public QualityDynamicTest setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestPrecondition> selectTestPreconditions() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testPreconditions);
  }

  public QualityDynamicTest setTestPreconditions(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestPrecondition> testPreconditions) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testPreconditions, testPreconditions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestStep> selectTestSteps() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestStep.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testSteps);
  }

  public QualityDynamicTest setTestSteps(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestStep> testSteps) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testSteps, testSteps);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QualityDynamicTest setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_expectedResult, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testPreconditions, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestStep.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testSteps, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e68767f9-4f8c-11e9-ad5d-977b17aab907,uw4F8AOkWKWq6OAPl8lKY9tCX/8=] */