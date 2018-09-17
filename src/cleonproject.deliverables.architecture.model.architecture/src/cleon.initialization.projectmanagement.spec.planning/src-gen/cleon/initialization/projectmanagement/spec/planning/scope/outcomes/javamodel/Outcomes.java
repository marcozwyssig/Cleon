package cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Outcomes extends DynamicResource implements IOutcomes {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomes> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOutcomes>() {
    
    @Override
    public IOutcomes create() {
      return new Outcomes();
    }
    
    @Override
    public IOutcomes create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Outcomes(resourceRepository, resource);
    }
  
  };

  public Outcomes() {
    super(IOutcomes.TYPE_ID);
  }
  
  public Outcomes(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOutcomes.TYPE_ID);
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

  public Outcomes setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome> selectOutcomes() {
    return _getMultiMap(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcomes_outcomes);
  }

  public Outcomes setOutcomes(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome> outcomes) {
    _setMultiMap(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcomes_outcomes, outcomes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Outcomes setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMultiMap(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcomes_outcomes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomes selectToMeOutcomes(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomes.class, cleon.initialization.projectmanagement.spec.planning.scope.outcomes.OutcomesPackage.Outcomes_outcomes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fdf40175-b53c-11e5-bc0c-f35b68c3609a,jIfbnNDK2cQ0cUza3d3KUw8f4Pc=] */
