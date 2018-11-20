package cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_9_aE_DesignDecision extends DynamicResource implements I__V_9_aE_DesignDecision {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_9_aE_DesignDecision> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_9_aE_DesignDecision>() {
    
    @Override
    public I__V_9_aE_DesignDecision create() {
      return new __V_9_aE_DesignDecision();
    }
    
    @Override
    public I__V_9_aE_DesignDecision create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_9_aE_DesignDecision(resourceRepository, resource);
    }
  
  };

  public __V_9_aE_DesignDecision() {
    super(I__V_9_aE_DesignDecision.TYPE_ID);
  }
  
  public __V_9_aE_DesignDecision(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_9_aE_DesignDecision.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDecisionTopic> selectDecisions() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.spec.arc42._09_design_decisions._09_design_decisionsPackage.__V_9_aE_DesignDecision_decisions);
  }

  public __V_9_aE_DesignDecision setDecisions(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDecisionTopic> decisions) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions._09_design_decisionsPackage.__V_9_aE_DesignDecision_decisions, decisions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public __V_9_aE_DesignDecision setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_9_aE_DesignDecision setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.spec.arc42._09_design_decisions._09_design_decisionsPackage.__V_9_aE_DesignDecision_decisions, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision selectToMeDecisions(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDecisionTopic object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.I__V_9_aE_DesignDecision.class, cleon.architecturemethods.arc42.spec.arc42._09_design_decisions._09_design_decisionsPackage.__V_9_aE_DesignDecision_decisions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e3c0d1c-d0b4-11e8-b005-f7630e4c29c0,Q8eApDMCYQOs4WbH9l6vFTjMF6s=] */
