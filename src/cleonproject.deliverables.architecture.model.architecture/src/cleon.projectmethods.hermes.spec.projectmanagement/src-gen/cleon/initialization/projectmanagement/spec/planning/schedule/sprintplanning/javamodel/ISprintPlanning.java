package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISprintPlanning extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.document.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db3c786a-c009-11e5-a165-d34765931e10");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel.ISprint selectSprint();
  
  public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintGoals selectSprintGoals();
  
  public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity selectSprintCapacity();
  
  public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog selectSprintBacklog();
  
  public cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeam selectTeam();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db3c786a-c009-11e5-a165-d34765931e10,uasonxWrqxYnwpyodWyoA793x3g=] */