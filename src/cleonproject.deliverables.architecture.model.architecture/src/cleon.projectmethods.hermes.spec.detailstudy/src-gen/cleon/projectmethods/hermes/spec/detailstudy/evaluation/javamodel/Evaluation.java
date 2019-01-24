package cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Evaluation extends DynamicResource implements IEvaluation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluation>() {
    
    @Override
    public IEvaluation create() {
      return new Evaluation();
    }
    
    @Override
    public IEvaluation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Evaluation(resourceRepository, resource);
    }
  
  };

  public Evaluation() {
    super(IEvaluation.TYPE_ID);
  }
  
  public Evaluation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvaluation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAssessment() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment);
  }
    
  public void setAssessment(java.lang.String assessment) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment, assessment);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteria selectCriteria() {
    return _getSingle(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteria.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_criteria);
  }

  public Evaluation setCriteria(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteria criteria) {
    _setSingle(cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_criteria, criteria);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IScore selectScore() {
    return _getSingle(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IScore.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_score);
  }

  public Evaluation setScore(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IScore score) {
    _setSingle(cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_score, score);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Evaluation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Evaluation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_assessment, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteria.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_criteria, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IScore.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_score, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation> selectToMeCriteria(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteria object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_criteria, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation> selectToMeScore(cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IScore object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation.class, cleon.projectmethods.hermes.spec.detailstudy.evaluation.EvaluationPackage.Evaluation_score, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,4LpXPj9dz3c8kkgx3tNbvpKXTIo=] */
