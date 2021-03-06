package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetworkAware extends ch.actifsource.core.javamodel.IResource, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("dba046bb-7ac9-11e9-a70f-4dc03941a024");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> selectNetworks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,dba046bb-7ac9-11e9-a70f-4dc03941a024,IXlrogU58QocdelSbdptYOlIQ6E=] */
