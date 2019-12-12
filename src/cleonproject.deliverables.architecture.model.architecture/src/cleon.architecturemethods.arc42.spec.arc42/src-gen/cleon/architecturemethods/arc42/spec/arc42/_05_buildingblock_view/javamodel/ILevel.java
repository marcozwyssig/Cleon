package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILevel extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1551fb66-2857-11e8-9af4-b7d7a3bbddc1");
  
  // relations
  
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectWhitebox();
  
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IChapter> selectChapters();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,ElAycCFWOV1M4gROK57GQA9tFHk=] */
