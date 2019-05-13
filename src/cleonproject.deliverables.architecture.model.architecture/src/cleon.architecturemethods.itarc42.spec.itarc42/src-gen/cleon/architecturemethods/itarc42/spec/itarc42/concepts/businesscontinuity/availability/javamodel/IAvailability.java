package cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailability extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IAbstractBusinessContinuityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ccb76508-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration> selectAvailabilitySystemConfigurations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ccb76508-0eae-11e9-9f19-6d15636f4ecc,gUtP7EpAGd0rRVgX+ErbppG+maY=] */
