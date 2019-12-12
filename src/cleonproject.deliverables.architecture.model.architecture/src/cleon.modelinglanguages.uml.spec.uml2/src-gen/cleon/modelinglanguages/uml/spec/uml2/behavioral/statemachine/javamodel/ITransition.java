package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITransition extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("813e6228-b07c-11e4-bca8-71d5b3e72cd6");
  
  // relations
  
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IState selectTargetState();
  
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent selectEvent();
  
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ICondition selectCondition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,813e6228-b07c-11e4-bca8-71d5b3e72cd6,/pG3oJGyE2l1sDrU4t8vPoPCsJE=] */
