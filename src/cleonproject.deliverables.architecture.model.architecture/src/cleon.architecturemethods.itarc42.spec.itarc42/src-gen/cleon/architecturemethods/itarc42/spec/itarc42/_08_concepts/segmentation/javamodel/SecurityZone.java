package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SecurityZone extends DynamicResource implements ISecurityZone {

  // abstract implementation, only used for static method calls
  private SecurityZone() {
    super(ISecurityZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISecurityZone selectToMeSecuritySubZones(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISecuritySubZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISecurityZone.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.SecurityZone_securitySubZones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,32beba1e-0b75-11e9-a136-69d076e48ed1,rXC0Yvqz/TN+PuJs5e9j5Gbl6N4=] */
