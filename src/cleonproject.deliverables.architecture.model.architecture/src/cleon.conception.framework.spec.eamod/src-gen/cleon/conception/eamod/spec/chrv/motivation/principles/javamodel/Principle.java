package cleon.conception.eamod.spec.chrv.motivation.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Principle extends DynamicResource implements IPrinciple {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrinciple> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrinciple>() {
    
    @Override
    public IPrinciple create() {
      return new Principle();
    }
    
    @Override
    public IPrinciple create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Principle(resourceRepository, resource);
    }
  
  };

  public Principle() {
    super(IPrinciple.TYPE_ID);
  }
  
  public Principle(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPrinciple.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.eamod.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves);
  }

  public Principle setAchieves(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> achieves) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, achieves);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple> selectAggregation() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple.class, cleon.conception.eamod.spec.chrv.motivation.principles.PrinciplesPackage.Principle_aggregation);
  }

  public Principle setAggregation(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple> aggregation) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.principles.PrinciplesPackage.Principle_aggregation, aggregation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public Principle setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Principle setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public Principle setOriginatesFromSource(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Principle setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptListAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.eamod.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple.class, cleon.conception.eamod.spec.chrv.motivation.principles.PrinciplesPackage.Principle_aggregation, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple selectToMeAggregation(cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.principles.javamodel.IPrinciple.class, cleon.conception.eamod.spec.chrv.motivation.principles.PrinciplesPackage.Principle_aggregation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6f06a6ec-a951-11e5-bda2-a7fc3bd7c783,HuEKYeSR0pY6Qmc2ZZCt9Dd7QM4=] */