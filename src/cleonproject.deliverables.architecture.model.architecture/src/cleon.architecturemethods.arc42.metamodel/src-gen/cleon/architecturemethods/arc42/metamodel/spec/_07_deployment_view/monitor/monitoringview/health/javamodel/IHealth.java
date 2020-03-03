package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHealth extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0bb30754-8993-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperators selectOperators();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IScripts selectScripts();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel.IDeviceBehaviours selectDeviceBehaviours();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0bb30754-8993-11e8-8250-d9b67f7d5f7f,MI3R7Sfww5kIMEoG3v7iHBHLnTg=] */
