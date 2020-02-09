package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Site extends DynamicResource implements ISite {

  // abstract implementation, only used for static method calls
  private Site() {
    super(ISite.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,119b879d-878b-11e9-a61b-279ebde48b48,CVb8gj+1Jjoka1QDnJCXDo7JwJY=] */