package cleon.conception.organisation.spec.epm.operational.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Operational extends DynamicResource implements IOperational {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperational> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperational>() {
    
    @Override
    public IOperational create() {
      return new Operational();
    }
    
    @Override
    public IOperational create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Operational(resourceRepository, resource);
    }
  
  };

  public Operational() {
    super(IOperational.TYPE_ID);
  }
  
  public Operational(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperational.TYPE_ID);
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

  public Operational setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0f35ccad-ba79-11e3-9206-f19b78f4aff0,BWOs4XCA/KUNrFrgSn+PWpgdmEc=] */
