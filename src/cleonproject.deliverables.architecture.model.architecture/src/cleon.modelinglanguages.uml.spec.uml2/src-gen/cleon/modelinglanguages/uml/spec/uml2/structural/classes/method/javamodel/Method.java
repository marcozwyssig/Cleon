package cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Method extends DynamicResource implements IMethod {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMethod> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMethod>() {
    
    @Override
    public IMethod create() {
      return new Method();
    }
    
    @Override
    public IMethod create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Method(resourceRepository, resource);
    }
  
  };

  public Method() {
    super(IMethod.TYPE_ID);
  }
  
  public Method(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMethod.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsObsolete() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Obsolete_isObsolete);
  }
    
  public void setIsObsolete(java.lang.Boolean isObsolete) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Obsolete_isObsolete, isObsolete);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectReturnTypeDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeDescription);
  }
    
  public void setReturnTypeDescription(java.lang.String returnTypeDescription) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeDescription, returnTypeDescription);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.messageExchange.javamodel.IMessageExchange selectMep() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.messageExchange.javamodel.IMessageExchange.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_mep);
  }

  public Method setMep(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.messageExchange.javamodel.IMessageExchange mep) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_mep, mep);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.parameter.javamodel.IParameter> selectParameters() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.parameter.javamodel.IParameter.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_parameters);
  }

  public Method setParameters(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.parameter.javamodel.IParameter> parameters) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_parameters, parameters);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier selectReturnType() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ReturnType_returnType);
  }

  public Method setReturnType(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier returnType) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ReturnType_returnType, returnType);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.ICollectionType selectReturnTypeAsCollection() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.ICollectionType.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeAsCollection);
  }

  public Method setReturnTypeAsCollection(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.ICollectionType returnTypeAsCollection) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeAsCollection, returnTypeAsCollection);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Method setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Obsolete_isObsolete, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeDescription, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.messageExchange.javamodel.IMessageExchange.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_mep, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.parameter.javamodel.IParameter.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_parameters, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ReturnType_returnType, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.ICollectionType.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeAsCollection, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod selectToMeParameters(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.parameter.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_parameters, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectToMeMep(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.messageExchange.javamodel.IMessageExchange object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_mep, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectToMeReturnTypeAsCollection(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.ICollectionType object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.Method_returnTypeAsCollection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,af648f48-e46c-11e2-b1e0-8de0cec58ee7,jSifxxrnPCpDiKCc0UsUf8JTKZk=] */
