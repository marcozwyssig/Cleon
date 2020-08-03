package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpdellequallogicmemberhealth extends DynamicResource implements ISnmpdellequallogicmemberhealth {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpdellequallogicmemberhealth> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpdellequallogicmemberhealth>() {
    
    @Override
    public ISnmpdellequallogicmemberhealth create() {
      return new Snmpdellequallogicmemberhealth();
    }
    
    @Override
    public ISnmpdellequallogicmemberhealth create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpdellequallogicmemberhealth(resourceRepository, resource);
    }
  
  };

  public Snmpdellequallogicmemberhealth() {
    super(ISnmpdellequallogicmemberhealth.TYPE_ID);
  }
  
  public Snmpdellequallogicmemberhealth(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpdellequallogicmemberhealth.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpdellequallogicmemberhealth setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b948c-c1eb-11ea-820f-9931558a898c,kw2QLrvtXiTAQYD8tBTIxZ8o4b4=] */