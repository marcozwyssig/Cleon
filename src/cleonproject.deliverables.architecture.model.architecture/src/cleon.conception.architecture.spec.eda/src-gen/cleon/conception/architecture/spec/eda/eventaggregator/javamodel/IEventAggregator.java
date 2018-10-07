package cleon.conception.architecture.spec.eda.eventaggregator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEventAggregator extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier, cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterface, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3a134cb4-d22a-11e4-8b90-c7d981a5f2fd");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eda.eventaggregator.javamodel.IPubSubEvent> selectEvents();
  
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier selectContext();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3a134cb4-d22a-11e4-8b90-c7d981a5f2fd,/G/Vt9fIkdVDDUsHUA/V3nw2ki8=] */
