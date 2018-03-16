package cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintCapacity extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ff83f76d-c00b-11e5-a165-d34765931e10");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity> selectPersonCapacity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ff83f76d-c00b-11e5-a165-d34765931e10,oJl/AdRqoev3ejygfQ9V+rUQGfs=] */
