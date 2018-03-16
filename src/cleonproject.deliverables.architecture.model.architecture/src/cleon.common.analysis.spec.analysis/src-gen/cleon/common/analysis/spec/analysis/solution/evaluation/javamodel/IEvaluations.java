package cleon.common.analysis.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluations extends cleon.common.analysis.spec.analysis.solution.javamodel.IAnalysisDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dcdfa04f-3c19-11e5-9962-cf3035adb922");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation> selectEvaluations();
  
  public cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IResult selectResult();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dcdfa04f-3c19-11e5-9962-cf3035adb922,lwaLrcF0jGRUsK9D2awCG94U+58=] */
