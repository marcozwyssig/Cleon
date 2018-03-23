package cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintPlanningAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6578c5b7-c110-11e6-8f58-ad3c6ee7602f");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint selectPlannedStartSprint();
  
  public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint selectPlannedEndSprint();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6578c5b7-c110-11e6-8f58-ad3c6ee7602f,di7+OhXWSco0eR9KrEBiCvG3eUs=] */