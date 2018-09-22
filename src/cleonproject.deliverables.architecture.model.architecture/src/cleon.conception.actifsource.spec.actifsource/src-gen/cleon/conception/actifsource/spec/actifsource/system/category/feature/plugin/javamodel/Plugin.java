package cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Plugin extends DynamicResource implements IPlugin {

  // abstract implementation, only used for static method calls
  private Plugin() {
    super(IPlugin.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectToMeDependsOn(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPluginDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_dependsOn, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectToMeResources(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_resources, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectToMeActifsource(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_actifsource, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectToMeJava(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_java, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectToMeGradle(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IGradle object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_gradle, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin selectToMePlugin(cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource.system.category.feature.plugin.PluginPackage.Plugin_plugin, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,LpbHdg6mhjkn0SxNO+wuUjfW5DE=] */
