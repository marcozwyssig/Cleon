package cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssociationClass extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier, cleon.common.modularity.spec.buildingblock.javamodel.IDependentBuildingBlock, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("deb55644-13d3-11e3-9736-a3484832b481");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation> selectRelations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,deb55644-13d3-11e3-9736-a3484832b481,ghGGjbsrEUyuAgkRzeegHxiN5L4=] */