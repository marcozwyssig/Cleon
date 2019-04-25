package ikt.product.documentation.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecuritySubZone extends ikt.product.documentation.spec.concepts.segmentation.javamodel.INamedZone, cleon.common.resources.spec.resources.confidentiality.javamodel.IClassificationAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f40c131-0b75-11e9-a136-69d076e48ed1");
  
  // relations
  
  public ikt.product.documentation.spec.concepts.segmentation.javamodel.IZone selectNoZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f40c131-0b75-11e9-a136-69d076e48ed1,w/TNTCW/2iFoIeKQMcQTQJR8auU=] */