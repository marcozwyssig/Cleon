package cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArchitectureBuildingBlock extends cleon.conception.architecture.spec.uml.structural.components.javamodel.INamedComponentComposition, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1a0f6f94-3a07-11e6-a354-253097f89a49");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlockDecomposite> selectArchitecturesolutionbuildingblocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1a0f6f94-3a07-11e6-a354-253097f89a49,RSbAhUU/GX+zSfDW6LemVlnXoY8=] */
