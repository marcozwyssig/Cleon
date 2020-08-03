package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Ptfwsusstatistics extends DynamicResource implements IPtfwsusstatistics {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPtfwsusstatistics> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPtfwsusstatistics>() {
    
    @Override
    public IPtfwsusstatistics create() {
      return new Ptfwsusstatistics();
    }
    
    @Override
    public IPtfwsusstatistics create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Ptfwsusstatistics(resourceRepository, resource);
    }
  
  };

  public Ptfwsusstatistics() {
    super(IPtfwsusstatistics.TYPE_ID);
  }
  
  public Ptfwsusstatistics(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPtfwsusstatistics.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Ptfwsusstatistics setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db533552-c1eb-11ea-820f-9931558a898c,49PByi2Amrh6W7CEqbJvMkx6VfI=] */