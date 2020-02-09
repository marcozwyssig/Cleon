package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivitySystemConfiguration extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractSecurityGroups {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0ef24c7d-1d9a-11e9-b601-db75aa6f89a4");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission> selectActivitiesForPermissions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0ef24c7d-1d9a-11e9-b601-db75aa6f89a4,gT7uGr+NpDphiGLSfhAUFU2rj2I=] */