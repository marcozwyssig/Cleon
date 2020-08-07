package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecurityConcept extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9515e875-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.realm.javamodel.IDirectoryService selectRealm();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC selectRbac();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccounts selectAccounts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9515e875-0eae-11e9-9f19-6d15636f4ecc,eGsh5N9ZuCZhzg4j77uqSzGQXp8=] */
