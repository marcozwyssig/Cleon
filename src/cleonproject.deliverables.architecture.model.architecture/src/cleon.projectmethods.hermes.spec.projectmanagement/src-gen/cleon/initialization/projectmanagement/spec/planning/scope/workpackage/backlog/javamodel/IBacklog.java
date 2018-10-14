package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBacklog extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("28af8502-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.Integer selectPlannedEstimate();
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,Fbjpx+RNQOci0jj2p0/cbVQLH2k=] */