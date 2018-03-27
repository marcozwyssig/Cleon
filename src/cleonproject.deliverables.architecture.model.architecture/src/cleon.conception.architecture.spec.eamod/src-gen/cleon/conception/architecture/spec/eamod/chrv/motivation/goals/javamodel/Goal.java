package cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Goal extends DynamicResource implements IGoal {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal>() {
    
    @Override
    public IGoal create() {
      return new Goal();
    }
    
    @Override
    public IGoal create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Goal(resourceRepository, resource);
    }
  
  };

  public Goal() {
    super(IGoal.TYPE_ID);
  }
  
  public Goal(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGoal.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.javamodel.IDriver> selectAddresses() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.javamodel.IDriver.class, cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.DriversPackage.DriverAware_addresses);
  }

  public Goal setAddresses(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.javamodel.IDriver> addresses) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.DriversPackage.DriverAware_addresses, addresses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public Goal setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Goal setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal> selectGoalAggregation() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.architecture.spec.eamod.chrv.motivation.goals.GoalsPackage.Goal_goalAggregation);
  }

  public Goal setGoalAggregation(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal> goalAggregation) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.GoalsPackage.Goal_goalAggregation, goalAggregation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public Goal setOriginatesFromSource(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Goal setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.javamodel.IDriver.class, cleon.conception.architecture.spec.eamod.chrv.motivation.drivers.DriversPackage.DriverAware_addresses, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.architecture.spec.eamod.chrv.motivation.goals.GoalsPackage.Goal_goalAggregation, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal selectToMeGoalAggregation(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.architecture.spec.eamod.chrv.motivation.goals.GoalsPackage.Goal_goalAggregation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,31468bb8-a951-11e5-bda2-a7fc3bd7c783,v7AMmIh8Wyies5eb08Dg/mkUEhs=] */