package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_users.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestUser extends DynamicResource implements ITestUser {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestUser> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestUser>() {
    
    @Override
    public ITestUser create() {
      return new TestUser();
    }
    
    @Override
    public ITestUser create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestUser(resourceRepository, resource);
    }
  
  };

  public TestUser() {
    super(ITestUser.TYPE_ID);
  }
  
  public TestUser(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestUser.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestUser setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bb1bba72-6728-11e9-9ec9-5fbc84faaeb1,UaQ4Bude/FIp15XFWO7i0vn8Lq0=] */