package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStateMachineDiagram extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier, cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IState, cleon.modelinglanguages.uml.spec.uml2.javamodel.IUmlDiagram {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6b3731f0-b07c-11e4-bca8-71d5b3e72cd6");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState> selectStates();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IEvent> selectEvents();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateMachineDiagram> selectSubStateMachine();
  
  public cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ISingleState selectStart();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6b3731f0-b07c-11e4-bca8-71d5b3e72cd6,DxCz8fbVulxvvi8a/Qos8OWJuhg=] */