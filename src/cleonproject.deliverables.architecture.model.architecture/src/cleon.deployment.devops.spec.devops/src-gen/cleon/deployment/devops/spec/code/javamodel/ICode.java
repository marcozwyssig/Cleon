package cleon.deployment.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICode extends cleon.deployment.devops.spec.javamodel.IBuildManagement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c9bd141d-406e-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public java.util.List<? extends cleon.deployment.devops.spec.code.javamodel.ICodeRepository> selectStore();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c9bd141d-406e-11e5-b5f0-5b1ce9c3de3e,IFdOKISOhr0szzXhczIQIf6+CuQ=] */
