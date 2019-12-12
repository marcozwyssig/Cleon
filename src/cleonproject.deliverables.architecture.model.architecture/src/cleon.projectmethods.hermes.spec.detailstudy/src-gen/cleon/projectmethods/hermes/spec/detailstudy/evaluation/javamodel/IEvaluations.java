package cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluations extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dcdfa04f-3c19-11e5-9962-cf3035adb922");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.ISolutionsEvaluation> selectEvaluations();
  
  public cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IResult selectResult();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dcdfa04f-3c19-11e5-9962-cf3035adb922,XvDZgBEq1bn4OgCwJosjAuh8o/U=] */
