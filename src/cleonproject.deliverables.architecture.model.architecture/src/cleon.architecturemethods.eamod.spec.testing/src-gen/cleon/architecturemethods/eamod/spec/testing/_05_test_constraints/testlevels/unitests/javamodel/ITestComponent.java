package cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestComponent extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a5ae6ce6-df47-11e2-b229-cd1bd4a07953");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestPackageDecomposition> selectTestPackages();
  
  public cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency selectComponentUnderTest();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a5ae6ce6-df47-11e2-b229-cd1bd4a07953,QM46qeyxx9EGP4Nm4DUSz0v0VvM=] */
