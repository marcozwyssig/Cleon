package cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Requirements_Coverage extends DynamicResource implements IRequirements_Coverage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirements_Coverage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirements_Coverage>() {
    
    @Override
    public IRequirements_Coverage create() {
      return new Requirements_Coverage();
    }
    
    @Override
    public IRequirements_Coverage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Requirements_Coverage(resourceRepository, resource);
    }
  
  };

  public Requirements_Coverage() {
    super(IRequirements_Coverage.TYPE_ID);
  }
  
  public Requirements_Coverage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirements_Coverage.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Requirements_Coverage setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.ISubjectAreaCoverage> selectSubjectAreaCoverage() {
    return _getMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.ISubjectAreaCoverage.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.Requirements_aE_Coverage_subjectAreaCoverage);
  }

  public Requirements_Coverage setSubjectAreaCoverage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.ISubjectAreaCoverage> subjectAreaCoverage) {
    _setMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.Requirements_aE_Coverage_subjectAreaCoverage, subjectAreaCoverage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Requirements_Coverage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.ISubjectAreaCoverage.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.Requirements_aE_Coverage_subjectAreaCoverage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirements_Coverage selectToMeSubjectAreaCoverage(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.ISubjectAreaCoverage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirements_Coverage.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.Requirements_aE_Coverage_subjectAreaCoverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,875d278c-d183-11e8-b18f-df1540bb7a5c,C+OUBCg+15IyHNfqyBmFXVTbuks=] */
