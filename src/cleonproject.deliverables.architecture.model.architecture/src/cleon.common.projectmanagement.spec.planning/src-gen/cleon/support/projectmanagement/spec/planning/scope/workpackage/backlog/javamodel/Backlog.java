package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Backlog extends DynamicResource implements IBacklog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog>() {
    
    @Override
    public IBacklog create() {
      return new Backlog();
    }
    
    @Override
    public IBacklog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Backlog(resourceRepository, resource);
    }
  
  };

  public Backlog() {
    super(IBacklog.TYPE_ID);
  }
  
  public Backlog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBacklog.TYPE_ID);
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
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_plannedEstimate, plannedEstimate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Backlog setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectGroups() {
    return _getList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups);
  }

  public Backlog setGroups(java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> groups) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups, groups);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule selectModule() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_module);
  }

  public Backlog setModule(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_module, module);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Backlog setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Backlog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_module, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog selectToMeGroups(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_groups, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog> selectToMeModule(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlog_module, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,LO5G5xsqBNbjCVm2XMuSM4p2d1g=] */