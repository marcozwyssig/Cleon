package cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStakeholders extends cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("256574f0-06d7-11e6-8d3e-13e5be4bd43b");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> selectStakeholders();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,256574f0-06d7-11e6-8d3e-13e5be4bd43b,IrRm6SXuHWN4kuT6gJAgOpd05Y0=] */
