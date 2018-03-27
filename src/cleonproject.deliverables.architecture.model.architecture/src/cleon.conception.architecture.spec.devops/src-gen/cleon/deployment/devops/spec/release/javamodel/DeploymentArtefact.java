package cleon.deployment.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentArtefact extends DynamicResource implements IDeploymentArtefact {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentArtefact> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentArtefact>() {
    
    @Override
    public IDeploymentArtefact create() {
      return new DeploymentArtefact();
    }
    
    @Override
    public IDeploymentArtefact create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentArtefact(resourceRepository, resource);
    }
  
  };

  public DeploymentArtefact() {
    super(IDeploymentArtefact.TYPE_ID);
  }
  
  public DeploymentArtefact(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentArtefact.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.deployment.devops.spec.release.type.javamodel.IDeploymentArtefactType selectDeploymentArtefactType() {
    return _getSingle(cleon.deployment.devops.spec.release.type.javamodel.IDeploymentArtefactType.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_deploymentArtefactType);
  }

  public DeploymentArtefact setDeploymentArtefactType(cleon.deployment.devops.spec.release.type.javamodel.IDeploymentArtefactType deploymentArtefactType) {
    _setSingle(cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_deploymentArtefactType, deploymentArtefactType);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> selectIncludes() {
    return _getList(cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_includes);
  }

  public DeploymentArtefact setIncludes(java.util.List<? extends cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> includes) {
    _setList(cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_includes, includes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.deployment.devops.spec.release.javamodel.IPackageRepository> selectPublishTo() {
    return _getList(cleon.deployment.devops.spec.release.javamodel.IPackageRepository.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_publishTo);
  }

  public DeploymentArtefact setPublishTo(java.util.List<? extends cleon.deployment.devops.spec.release.javamodel.IPackageRepository> publishTo) {
    _setList(cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_publishTo, publishTo);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> selectReferences() {
    return _getList(cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_references);
  }

  public DeploymentArtefact setReferences(java.util.List<? extends cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> references) {
    _setList(cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_references, references);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentArtefact setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentArtefact setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.deployment.devops.spec.release.type.javamodel.IDeploymentArtefactType.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_deploymentArtefactType, visitor);
    _acceptList(cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_includes, visitor);
    _acceptList(cleon.deployment.devops.spec.release.javamodel.IPackageRepository.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_publishTo, visitor);
    _acceptList(cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_references, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> selectToMeIncludes(cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_includes, object.getResource());
  }
  
  public static java.util.List<cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> selectToMeReferences(cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_references, object.getResource());
  }
  
  public static java.util.List<cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> selectToMePublishTo(cleon.deployment.devops.spec.release.javamodel.IPackageRepository object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_publishTo, object.getResource());
  }
  
  public static java.util.List<cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact> selectToMeDeploymentArtefactType(cleon.deployment.devops.spec.release.type.javamodel.IDeploymentArtefactType object) {
    return _getToMeList(object.getRepository(), cleon.deployment.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.deployment.devops.spec.release.ReleasePackage.DeploymentArtefact_deploymentArtefactType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,15cb1207-4071-11e5-b5f0-5b1ce9c3de3e,hEfSdQpRLK2AJQQvL6mEnfLRCGs=] */
