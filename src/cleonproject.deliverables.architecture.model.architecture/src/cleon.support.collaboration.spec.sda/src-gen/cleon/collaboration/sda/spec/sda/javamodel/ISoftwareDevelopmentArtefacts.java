package cleon.collaboration.sda.spec.sda.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareDevelopmentArtefacts extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ea1700ac-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.conception.eamod.spec.chrv.javamodel.IRequirementsManagement selectRequirementManagement();
  
  public cleon.support.projectmanagement.spec.planning.javamodel.IPlanning selectPlanning();
  
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.javamodel.ISolutionAnalysis> selectSolutionAnalysis();
  
  public cleon.collaboration.sda.spec.sda.manuals.readme.javamodel.IReadme selectReadme();
  
  public cleon.implementation.testing.spec.testing.javamodel.ITesting selectTesting();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,t7t0PFpDWTYETUCQ+wfbl4BfoBo=] */