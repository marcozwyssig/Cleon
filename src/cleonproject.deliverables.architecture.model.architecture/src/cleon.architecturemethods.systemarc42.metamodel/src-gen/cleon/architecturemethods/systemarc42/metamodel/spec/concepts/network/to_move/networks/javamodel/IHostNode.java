package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHostNode extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1580b55d-92a0-11e9-b2b4-f340ae70802c");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractHost selectHost();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1580b55d-92a0-11e9-b2b4-f340ae70802c,6AynqX7Lra8o/ogAirTN9kYkX0A=] */