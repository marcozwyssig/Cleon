package cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_1_aE_IntroductionAndGoals extends DynamicResource implements I__V_1_aE_IntroductionAndGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_1_aE_IntroductionAndGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_1_aE_IntroductionAndGoals>() {
    
    @Override
    public I__V_1_aE_IntroductionAndGoals create() {
      return new __V_1_aE_IntroductionAndGoals();
    }
    
    @Override
    public I__V_1_aE_IntroductionAndGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_1_aE_IntroductionAndGoals(resourceRepository, resource);
    }
  
  };

  public __V_1_aE_IntroductionAndGoals() {
    super(I__V_1_aE_IntroductionAndGoals.TYPE_ID);
  }
  
  public __V_1_aE_IntroductionAndGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_1_aE_IntroductionAndGoals.TYPE_ID);
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

  public __V_1_aE_IntroductionAndGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals selectQualityGoals() {
    return _getSingle(cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.conception.framework.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.__V_1_aE_IntroductionAndGoals_qualityGoals);
  }

  public __V_1_aE_IntroductionAndGoals setQualityGoals(cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals qualityGoals) {
    _setSingle(cleon.conception.framework.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.__V_1_aE_IntroductionAndGoals_qualityGoals, qualityGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_1_aE_IntroductionAndGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.conception.framework.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.__V_1_aE_IntroductionAndGoals_qualityGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals selectToMeQualityGoals(cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.framework.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals.class, cleon.conception.framework.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.__V_1_aE_IntroductionAndGoals_qualityGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1708484-11fc-11e5-848b-017a3a98ae34,yNY003Iqfm4HR7sBlxs48oDfmtY=] */