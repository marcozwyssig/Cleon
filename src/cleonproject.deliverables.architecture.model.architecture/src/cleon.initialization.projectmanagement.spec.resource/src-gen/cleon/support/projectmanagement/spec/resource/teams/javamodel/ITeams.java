package cleon.support.projectmanagement.spec.resource.teams.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITeams extends cleon.support.projectmanagement.spec.resource.javamodel.IResources {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6744688b-2eea-11e6-8bd9-a77b8d2a3a0e");
  
  // relations
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeam> selectTeams();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6744688b-2eea-11e6-8bd9-a77b8d2a3a0e,zWLik6fs9o3m4tkRa0KRvkFf4Gc=] */