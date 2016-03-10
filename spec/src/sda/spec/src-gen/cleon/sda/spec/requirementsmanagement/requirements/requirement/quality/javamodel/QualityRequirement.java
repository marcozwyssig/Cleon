package cleon.sda.spec.requirementsmanagement.requirements.requirement.quality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QualityRequirement extends DynamicResource implements IQualityRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityRequirement>() {
    
    @Override
    public IQualityRequirement create() {
      return new QualityRequirement();
    }
    
    @Override
    public IQualityRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QualityRequirement(resourceRepository, resource);
    }
  
  };

  public QualityRequirement() {
    super(IQualityRequirement.TYPE_ID);
  }
  
  public QualityRequirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQualityRequirement.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
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
    return _getListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, notes);
  }

  @Override
  public java.lang.String selectRejectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_rejectReason);
  }
    
  public void setRejectReason(java.lang.String rejectReason) {
     _setSingleAttribute(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_rejectReason, rejectReason);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.resources.spec.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.resources.spec.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.abstraction_level.javamodel.IAbstractionLevel.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_abstractionLevel);
  }

  public QualityRequirement setAbstractionLevel(cleon.sda.spec.requirementsmanagement.requirements.abstraction_level.javamodel.IAbstractionLevel abstractionLevel) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_abstractionLevel, abstractionLevel);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_achieves);
  }

  public QualityRequirement setAchieves(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> achieves) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_achieves, achieves);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectAggregates() {
    return _getList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates);
  }

  public QualityRequirement setAggregates(java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> aggregates) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public QualityRequirement setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public QualityRequirement setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConcretizes() {
    return _getList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes);
  }

  public QualityRequirement setConcretizes(java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> concretizes) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes, concretizes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConflicts() {
    return _getList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_conflicts);
  }

  public QualityRequirement setConflicts(java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> conflicts) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_conflicts, conflicts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public QualityRequirement setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate);
  }

  public QualityRequirement setEstimate(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue> selectIssues() {
    return _getList(cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.IssueAware_issues);
  }

  public QualityRequirement setIssues(java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue> issues) {
    _setList(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.IssueAware_issues, issues);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.IParagraph selectNoParagraph() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph);
  }

  public QualityRequirement setNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph noParagraph) {
    _setSingle(cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, noParagraph);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFrom() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_originatesFrom);
  }

  public QualityRequirement setOriginatesFrom(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> originatesFrom) {
    _setList(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_originatesFrom, originatesFrom);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public QualityRequirement setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public QualityRequirement setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState selectState() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state);
  }

  public QualityRequirement setState(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState state) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state, state);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.INonFunctionalTemplate selectTemplate() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.INonFunctionalTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.NonFunctionalRequirement_template);
  }

  public QualityRequirement setTemplate(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.INonFunctionalTemplate template) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.NonFunctionalRequirement_template, template);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QualityRequirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public QualityRequirement setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_rejectReason, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.resources.spec.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.abstraction_level.javamodel.IAbstractionLevel.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_abstractionLevel, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_achieves, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates, visitor);
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_conflicts, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.IssueAware_issues, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_originatesFrom, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.INonFunctionalTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.NonFunctionalRequirement_template, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,66cfdfc4-a95d-11e5-bda2-a7fc3bd7c783,YQu7xc+0793dwLSWgVhmLpGF66g=] */
