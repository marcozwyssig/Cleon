package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleUtilization extends DynamicResource implements IModuleUtilization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleUtilization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleUtilization>() {
    
    @Override
    public IModuleUtilization create() {
      return new ModuleUtilization();
    }
    
    @Override
    public IModuleUtilization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleUtilization(resourceRepository, resource);
    }
  
  };

  public ModuleUtilization() {
    super(IModuleUtilization.TYPE_ID);
  }
  
  public ModuleUtilization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleUtilization.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ModuleUtilization setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome selectModule() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module);
  }

  public ModuleUtilization setModule(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome module) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, module);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectRoleUtilizations() {
    return _getMap(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations);
  }

  public ModuleUtilization setRoleUtilizations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> roleUtilizations) {
    _setMap(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, roleUtilizations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ModuleUtilization setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleUtilization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, visitor);
    _acceptMap(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization> selectToMeModule(cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_module, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization selectToMeRoleUtilizations(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ModuleUtilization_roleUtilizations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27e45355-c291-11e6-ba8e-05f5391bcda8,Uf7mjtwnSvumhnBm7lK/a8TIStY=] */
