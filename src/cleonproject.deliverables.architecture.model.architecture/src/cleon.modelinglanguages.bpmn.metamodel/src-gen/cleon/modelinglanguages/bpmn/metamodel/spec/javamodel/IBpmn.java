package cleon.modelinglanguages.bpmn.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBpmn extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b0d96e05-7e49-11e5-85ce-e7c8e0b30f03");
  
  // relations
  
  public cleon.modelinglanguages.bpmn.metamodel.spec.organisational.javamodel.IOrganisational selectOrganisational();
  
  public cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IOrganigram selectOrganigram();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b0d96e05-7e49-11e5-85ce-e7c8e0b30f03,INOuCGPXFs5nvD0UO1ZvuBY9wjw=] */
