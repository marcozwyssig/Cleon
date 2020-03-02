package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SystemConfigurationAware extends DynamicResource implements ISystemConfigurationAware {

  // abstract implementation, only used for static method calls
  private SystemConfigurationAware() {
    super(ISystemConfigurationAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationAware selectToMeSystemConfigurations(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationAware.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfigurationAware_systemConfigurations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0383a7a0-3eaf-11ea-8cb4-0b006790b142,EnYuz8dmurSD4xyxT5Kjjxk4pHk=] */
