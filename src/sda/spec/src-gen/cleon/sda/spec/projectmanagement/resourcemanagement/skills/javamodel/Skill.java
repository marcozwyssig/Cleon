package cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Skill extends DynamicResource implements ISkill {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISkill> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISkill>() {
    
    @Override
    public ISkill create() {
      return new Skill();
    }
    
    @Override
    public ISkill create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Skill(resourceRepository, resource);
    }
  
  };

  public Skill() {
    super(ISkill.TYPE_ID);
  }
  
  public Skill(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISkill.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_description);
  }
    
  public void setDescription(java.lang.String description) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_description, description);
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
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_importance);
  }

  public Skill setImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance importance) {
    _setSingle(cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_importance, importance);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Skill setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_description, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_importance, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill> selectToMeImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill.class, cleon.sda.spec.projectmanagement.resourcemanagement.skills.SkillsPackage.Skill_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,76d12317-a7d8-11e5-82dd-3b995d9c840c,ia4xury/j85xfzMrwx2l3Adg8co=] */
