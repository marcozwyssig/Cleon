package cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Gradle extends DynamicResource implements IGradle {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGradle> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGradle>() {
    
    @Override
    public IGradle create() {
      return new Gradle();
    }
    
    @Override
    public IGradle create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Gradle(resourceRepository, resource);
    }
  
  };

  public Gradle() {
    super(IGradle.TYPE_ID);
  }
  
  public Gradle(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGradle.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Gradle setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f150252c-3fd7-11e8-bd50-b94594551673,5v8zJzCugdMIx38D9CYcTuAirdk=] */
