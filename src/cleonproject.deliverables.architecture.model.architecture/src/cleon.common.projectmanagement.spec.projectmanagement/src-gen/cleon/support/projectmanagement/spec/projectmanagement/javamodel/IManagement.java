package cleon.support.projectmanagement.spec.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IManagement extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1ee9b306-bdf8-11e6-a3f0-c7681ee45a3f");
  
  // relations
  
  public cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocols selectProtocols();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1ee9b306-bdf8-11e6-a3f0-c7681ee45a3f,0CTm6TEY5FqIpa6jCDRJiOaI5KY=] */