package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Manufactor extends DynamicResource implements IManufactor {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufactor> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManufactor>() {
    
    @Override
    public IManufactor create() {
      return new Manufactor();
    }
    
    @Override
    public IManufactor create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Manufactor(resourceRepository, resource);
    }
  
  };

  public Manufactor() {
    super(IManufactor.TYPE_ID);
  }
  
  public Manufactor(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManufactor.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> selectProducts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Manufactor_products);
  }

  public Manufactor setProducts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> products) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Manufactor_products, products);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Manufactor setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Manufactor_products, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IManufactor selectToMeProducts(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IManufactor.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Manufactor_products, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2371f6a6-d0b1-11e8-b005-f7630e4c29c0,m8yMQYf+d/tYDPbZyxinqyZREns=] */
