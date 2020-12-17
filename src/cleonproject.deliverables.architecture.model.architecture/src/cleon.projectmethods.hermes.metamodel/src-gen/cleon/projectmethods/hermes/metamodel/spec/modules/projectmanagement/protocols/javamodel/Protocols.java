package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Protocols extends DynamicResource implements IProtocols {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocols> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocols>() {
    
    @Override
    public IProtocols create() {
      return new Protocols();
    }
    
    @Override
    public IProtocols create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Protocols(resourceRepository, resource);
    }
  
  };

  public Protocols() {
    super(IProtocols.TYPE_ID);
  }
  
  public Protocols(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocols.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol> selectProtocols() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols);
  }

  public Protocols setProtocols(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol> protocols) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols, protocols);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Protocols setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols selectToMeProtocols(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocol object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9251a72-a7d8-11e5-82dd-3b995d9c840c,LZ/Etsb2u3avNAH3Wi82fdRGerA=] */
