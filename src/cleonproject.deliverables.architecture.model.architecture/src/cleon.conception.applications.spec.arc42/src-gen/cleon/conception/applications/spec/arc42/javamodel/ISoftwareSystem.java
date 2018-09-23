package cleon.conception.applications.spec.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareSystem extends cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem, cleon.conception.architecture.spec.uml.structural.components.javamodel.IAbstractComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9237e4d5-4aa3-11e6-9c0f-393d355c5fe3");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9237e4d5-4aa3-11e6-9c0f-393d355c5fe3,sR2x3V3fcKT+Bfpj9f8TL7mgiaA=] */