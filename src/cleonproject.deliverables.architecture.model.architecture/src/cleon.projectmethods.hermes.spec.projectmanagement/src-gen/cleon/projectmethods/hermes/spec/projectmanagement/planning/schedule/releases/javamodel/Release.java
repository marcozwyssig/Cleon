package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Release extends DynamicResource implements IRelease {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease>() {
    
    @Override
    public IRelease create() {
      return new Release();
    }
    
    @Override
    public IRelease create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Release(resourceRepository, resource);
    }
  
  };

  public Release() {
    super(IRelease.TYPE_ID);
  }
  
  public Release(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRelease.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Release setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage> selectPlannedWorkpackages() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_plannedWorkpackages);
  }

  public Release setPlannedWorkpackages(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage> plannedWorkpackages) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_plannedWorkpackages, plannedWorkpackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint> selectSprints() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_sprints);
  }

  public Release setSprints(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint> sprints) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_sprints, sprints);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Release setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Release setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning> selectWorkpackagePlannings() {
    return _getMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_workpackagePlannings);
  }

  public Release setWorkpackagePlannings(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning> workpackagePlannings) {
    _setMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_workpackagePlannings, workpackagePlannings);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_plannedWorkpackages, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_sprints, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMultiMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_workpackagePlannings, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IRelease selectToMePlannedWorkpackages(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackage object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IRelease.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_plannedWorkpackages, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IRelease selectToMeSprints(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IRelease.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_sprints, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IRelease selectToMeWorkpackagePlannings(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.workpackageplanning.javamodel.IWorkpackagePlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.IRelease.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.Release_workpackagePlannings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,zgqi4zKFeewLBG0CRDAdc5T+eDc=] */