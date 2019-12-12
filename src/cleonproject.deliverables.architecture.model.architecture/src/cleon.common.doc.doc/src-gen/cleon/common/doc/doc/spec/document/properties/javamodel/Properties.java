package cleon.common.doc.doc.spec.document.properties.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Properties extends DynamicResource implements IProperties {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperties> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperties>() {
    
    @Override
    public IProperties create() {
      return new Properties();
    }
    
    @Override
    public IProperties create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Properties(resourceRepository, resource);
    }
  
  };

  public Properties() {
    super(IProperties.TYPE_ID);
  }
  
  public Properties(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProperties.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDocumentType() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_documentType);
  }
    
  public void setDocumentType(java.lang.String documentType) {
     _setSingleAttribute(cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_documentType, documentType);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public Properties setAuthors(java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification.class, cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification);
  }

  public Properties setClassification(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification classification) {
    _setSingle(cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification, classification);
    return this;
  }
    
  @Override
  public cleon.common.doc.doc.spec.document.properties.javamodel.ICustomer selectCustomer() {
    return _getSingle(cleon.common.doc.doc.spec.document.properties.javamodel.ICustomer.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_customer);
  }

  public Properties setCustomer(cleon.common.doc.doc.spec.document.properties.javamodel.ICustomer customer) {
    _setSingle(cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_customer, customer);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> selectDistributers() {
    return _getList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Distributers_distributers);
  }

  public Properties setDistributers(java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> distributers) {
    _setList(cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Distributers_distributers, distributers);
    return this;
  }
    
  @Override
  public cleon.common.doc.doc.spec.document.properties.javamodel.IProject selectProject() {
    return _getSingle(cleon.common.doc.doc.spec.document.properties.javamodel.IProject.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_project);
  }

  public Properties setProject(cleon.common.doc.doc.spec.document.properties.javamodel.IProject project) {
    _setSingle(cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_project, project);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> selectReviewers() {
    return _getList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Reviewers_reviewers);
  }

  public Properties setReviewers(java.util.List<? extends cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember> reviewers) {
    _setList(cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Reviewers_reviewers, reviewers);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Properties setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISystemStage selectSystemStage() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage);
  }

  public Properties setSystemStage(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage systemStage) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, systemStage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Properties setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public Properties setVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_documentType, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification.class, cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification, visitor);
    _acceptSingle(cleon.common.doc.doc.spec.document.properties.javamodel.ICustomer.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_customer, visitor);
    _acceptList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Distributers_distributers, visitor);
    _acceptSingle(cleon.common.doc.doc.spec.document.properties.javamodel.IProject.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_project, visitor);
    _acceptList(cleon.common.doc.doc.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.doc.spec.document.properties.member.MemberPackage.Reviewers_reviewers, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISystemStage.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_systemStage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

  public static java.util.List<cleon.common.doc.doc.spec.document.properties.javamodel.IProperties> selectToMeProject(cleon.common.doc.doc.spec.document.properties.javamodel.IProject object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.doc.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_project, object.getResource());
  }
  
  public static java.util.List<cleon.common.doc.doc.spec.document.properties.javamodel.IProperties> selectToMeCustomer(cleon.common.doc.doc.spec.document.properties.javamodel.ICustomer object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.doc.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.doc.spec.document.properties.PropertiesPackage.Properties_customer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a052f72d-47f5-11e6-b388-8539f6ff7310,B5M10Ex8NIpKuoNnfuT01O93578=] */