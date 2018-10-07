package cleon.applications.actifsource.sample.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Chair extends DynamicResource implements IChair {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChair> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChair>() {
    
    @Override
    public IChair create() {
      return new Chair();
    }
    
    @Override
    public IChair create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Chair(resourceRepository, resource);
    }
  
  };

  public Chair() {
    super(IChair.TYPE_ID);
  }
  
  public Chair(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChair.TYPE_ID);
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

  public Chair setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb9da58f-26bc-11e8-a805-991f3ff583b7,yb1ijC0l9pTVEi+Dgek1iKgEm7w=] */
