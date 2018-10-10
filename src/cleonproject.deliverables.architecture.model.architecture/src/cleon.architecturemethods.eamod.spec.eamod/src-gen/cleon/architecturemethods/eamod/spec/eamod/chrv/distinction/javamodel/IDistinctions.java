package cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDistinctions extends cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e94265a9-0e1a-11e6-ae01-ef640c578b9b");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.outofscope.javamodel.IOutOfScopes selectOutofscope();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.supply.javamodel.ISupplies selectSupply();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e94265a9-0e1a-11e6-ae01-ef640c578b9b,NkwsVzk0diqed9pDTeYg7GLeeT8=] */
