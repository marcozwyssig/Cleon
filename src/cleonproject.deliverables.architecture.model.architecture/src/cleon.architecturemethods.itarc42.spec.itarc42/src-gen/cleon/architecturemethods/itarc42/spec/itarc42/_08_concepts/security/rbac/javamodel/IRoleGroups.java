package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleGroups extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3e5a557a-1d99-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRoleSecurityGroup> selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3e5a557a-1d99-11e9-b601-db75aa6f89a4,Mcqt+vPqjZXx2JEGWd5rV2jfJ4U=] */