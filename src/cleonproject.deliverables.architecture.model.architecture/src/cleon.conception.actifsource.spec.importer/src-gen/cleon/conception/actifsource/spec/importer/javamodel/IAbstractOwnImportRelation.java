package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractOwnImportRelation extends cleon.conception.actifsource.spec.importer.javamodel.IAbstractImportElement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a1575b5b-23a6-11e8-9237-83e9a2871328");
  
  // relations
  
  public ch.actifsource.core.javamodel.IOwnRelation selectRelation();
  
  public ch.actifsource.core.javamodel.IAttribute selectDiscriminator();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportClass> selectMapCls();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a1575b5b-23a6-11e8-9237-83e9a2871328,I/5FUzicW1/SMmU+x/ocT/w3nUo=] */