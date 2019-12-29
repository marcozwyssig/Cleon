package cleon.projectmethods.hermes.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Scenario extends DynamicResource implements IScenario {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScenario> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScenario>() {
    
    @Override
    public IScenario create() {
      return new Scenario();
    }
    
    @Override
    public IScenario create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Scenario(resourceRepository, resource);
    }
  
  };

  public Scenario() {
    super(IScenario.TYPE_ID);
  }
  
  public Scenario(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScenario.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Scenario setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e33988e3-31cf-11e8-8a84-6f139e67278b,GjqYnXoiJhf6maiAyovzA5VIO8A=] */
