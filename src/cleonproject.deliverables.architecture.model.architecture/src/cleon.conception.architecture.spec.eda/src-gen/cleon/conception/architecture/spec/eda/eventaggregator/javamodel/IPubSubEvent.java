package cleon.conception.architecture.spec.eda.eventaggregator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPubSubEvent extends ch.actifsource.core.javamodel.IDecorator, cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98ea7936-d22a-11e4-8b90-c7d981a5f2fd");
  
  // relations
  
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent selectEvent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98ea7936-d22a-11e4-8b90-c7d981a5f2fd,JbMoBkQs47go0utHjSvxmYfDkTU=] */
