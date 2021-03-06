package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.protocolsitems.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Task extends DynamicResource implements ITask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITask>() {
    
    @Override
    public ITask create() {
      return new Task();
    }
    
    @Override
    public ITask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Task(resourceRepository, resource);
    }
  
  };

  public Task() {
    super(ITask.TYPE_ID);
  }
  
  public Task(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, name);
  }

  // relations
  
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectDeadline() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.ResourcePackage.TargetDate_deadline);
  }

  public Task setDeadline(cleon.common.calendar.metamodel.spec.javamodel.IDay deadline) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.ResourcePackage.TargetDate_deadline, deadline);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> selectResponsibles() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles);
  }

  public Task setResponsibles(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> responsibles) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, responsibles);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState.class, cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Task setState(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Task setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, visitor);
    // relations
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.ResourcePackage.TargetDate_deadline, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState.class, cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,55988936-b463-11e5-a3f4-497fd75158dc,z5Q0660NlMbfXuJ0RGZ5DAc1FsQ=] */
