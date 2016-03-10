package cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UserStory extends DynamicResource implements IUserStory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserStory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserStory>() {
    
    @Override
    public IUserStory create() {
      return new UserStory();
    }
    
    @Override
    public IUserStory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UserStory(resourceRepository, resource);
    }
  
  };

  public UserStory() {
    super(IUserStory.TYPE_ID);
  }
  
  public UserStory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUserStory.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, reference);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis);
  }

  public UserStory setAnalysis(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText analysis) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate);
  }

  public UserStory setEstimate(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectOwner() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner);
  }

  public UserStory setOwner(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> owner) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectPreconditions() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_preconditions);
  }

  public UserStory setPreconditions(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> preconditions) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_preconditions, preconditions);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IPriority.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_priority);
  }

  public UserStory setPriority(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IPriority priority) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_priority, priority);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement);
  }

  public UserStory setRequirement(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement, requirement);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItemState selectState() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItemState.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_state);
  }

  public UserStory setState(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItemState state) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public UserStory setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UserStory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_reference, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_preconditions, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IPriority.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_priority, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItemState.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory> selectToMeRequirement(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory.class, cleon.sda.spec.projectmanagement.scope.backlog.story.StoryPackage.UserStory_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,693cc9f9-ff9c-11e4-ac0a-959b440f987f,1jqXHZZcS12yPZezoiKCdDnEO7E=] */
