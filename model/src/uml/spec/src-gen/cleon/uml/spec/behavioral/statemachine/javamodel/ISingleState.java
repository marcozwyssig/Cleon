package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISingleState extends cleon.uml.spec.structural.classes.javamodel.IClassifier, cleon.doc.spec.chapter.javamodel.IChapter, cleon.uml.spec.behavioral.statemachine.javamodel.IState {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f13ba82-b07c-11e4-bca8-71d5b3e72cd6");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.behavioral.statemachine.javamodel.ITransition> selectTransition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f13ba82-b07c-11e4-bca8-71d5b3e72cd6,ubJQRCHA/sz0gT654Brb2hbqVYI=] */