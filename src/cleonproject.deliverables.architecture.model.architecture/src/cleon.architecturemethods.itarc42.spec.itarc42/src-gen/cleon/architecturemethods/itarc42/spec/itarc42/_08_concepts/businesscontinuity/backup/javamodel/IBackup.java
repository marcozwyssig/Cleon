package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackup extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.javamodel.IBusinessContinuityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.backup.javamodel.IBackupSystemConfiguration> selectBackupSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ce6a4faa-0eaf-11e9-9f19-6d15636f4ecc,7F8OASOplLiKP++ugdy1Ce9Bvrg=] */
