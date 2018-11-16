package cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_4_aE_Solution_aE_Strategy extends DynamicResource implements I__V_4_aE_Solution_aE_Strategy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_4_aE_Solution_aE_Strategy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_4_aE_Solution_aE_Strategy>() {
    
    @Override
    public I__V_4_aE_Solution_aE_Strategy create() {
      return new __V_4_aE_Solution_aE_Strategy();
    }
    
    @Override
    public I__V_4_aE_Solution_aE_Strategy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_4_aE_Solution_aE_Strategy(resourceRepository, resource);
    }
  
  };

  public __V_4_aE_Solution_aE_Strategy() {
    super(I__V_4_aE_Solution_aE_Strategy.TYPE_ID);
  }
  
  public __V_4_aE_Solution_aE_Strategy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_4_aE_Solution_aE_Strategy.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements);
  }

  public __V_4_aE_Solution_aE_Strategy setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_4_aE_Solution_aE_Strategy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IStandardDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardDocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,650ddeb2-e985-11e8-af5c-a5aa9dc47205,VWkwXd3gzGP9zXk0YvY/1dTji8A=] */
