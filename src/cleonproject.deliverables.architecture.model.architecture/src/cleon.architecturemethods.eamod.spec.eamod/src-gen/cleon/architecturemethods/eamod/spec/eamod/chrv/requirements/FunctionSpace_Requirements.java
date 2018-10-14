package cleon.architecturemethods.eamod.spec.eamod.chrv.requirements;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,imports]] */

/* End Protected Region   [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,imports]] */

public class FunctionSpace_Requirements {

  /* Begin Protected Region [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45]] */
  
  /* End Protected Region   [[6f7a099f-c90b-11e5-a64e-a5d84d8f1b45]] */


  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9a0b681e-c90b-11e5-a64e-a5d84d8f1b45")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> GetAllRequirements();

    @IDynamicResourceExtension.MethodId("0f54f2eb-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

    @IDynamicResourceExtension.MethodId("87f5fade-decb-11e5-bcfc-4385ab45a525")
    public java.lang.String GetTemplate();

    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("4e98d118-e609-11e5-950a-cb0c4b71716c")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("f5702103-e61b-11e5-8630-f311cd9d9999")
    public java.lang.String GetUniqueName();

    @IDynamicResourceExtension.MethodId("b2f750bb-0e00-11e6-ae01-ef640c578b9b")
    public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement GetParent();

    @IDynamicResourceExtension.MethodId("e0f79703-0e00-11e6-ae01-ef640c578b9b")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoal> GetGoals();

    @IDynamicResourceExtension.MethodId("52c50b22-0e01-11e6-ae01-ef640c578b9b")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoal> GetAllGoals();

    @IDynamicResourceExtension.MethodId("30e9c967-2cb1-11e6-8dd6-23b9a87b3ebd")
    public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea GetSubjectArea();

    @IDynamicResourceExtension.MethodId("45609ac6-10a4-11e8-ab55-75346738d444")
    public java.lang.String GetPriorityName();

    @IDynamicResourceExtension.MethodId("2ae79964-c82b-11e8-add3-695b26858127")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> GetAllStakeholders();

    @IDynamicResourceExtension.MethodId("416d48c7-c82b-11e8-add3-695b26858127")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> GetStakeholders();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b82ce62e-c4f5-11e5-b41d-5d67443850a2")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement);

  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
      return String.format("AF%03d", requirement.selectIdentifier());
    }

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirement).GetId(requirement);
    }

  }

  public static interface IFormalFunctionalRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("40854325-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface IFormalFunctionalRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FormalFunctionalRequirementFunctionsImpl implements IFormalFunctionalRequirementFunctionsImpl {

    public static final IFormalFunctionalRequirementFunctionsImpl INSTANCE = new FormalFunctionalRequirementFunctionsImpl();

    private FormalFunctionalRequirementFunctionsImpl() {}

  }
  
  public static class FormalFunctionalRequirementFunctions {

    private FormalFunctionalRequirementFunctions() {}

  }

  public static interface IUserStoryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64d252c1-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface IUserStoryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserStoryFunctionsImpl implements IUserStoryFunctionsImpl {

    public static final IUserStoryFunctionsImpl INSTANCE = new UserStoryFunctionsImpl();

    private UserStoryFunctionsImpl() {}

  }
  
  public static class UserStoryFunctions {

    private UserStoryFunctions() {}

  }

  public static interface ISimpleFunctionalRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6d6aa41a-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface ISimpleFunctionalRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SimpleFunctionalRequirementFunctionsImpl implements ISimpleFunctionalRequirementFunctionsImpl {

    public static final ISimpleFunctionalRequirementFunctionsImpl INSTANCE = new SimpleFunctionalRequirementFunctionsImpl();

    private SimpleFunctionalRequirementFunctionsImpl() {}

  }
  
  public static class SimpleFunctionalRequirementFunctions {

    private SimpleFunctionalRequirementFunctions() {}

  }

  public static interface ITechnologyRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("787925cd-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface ITechnologyRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnologyRequirementFunctionsImpl implements ITechnologyRequirementFunctionsImpl {

    public static final ITechnologyRequirementFunctionsImpl INSTANCE = new TechnologyRequirementFunctionsImpl();

    private TechnologyRequirementFunctionsImpl() {}

  }
  
  public static class TechnologyRequirementFunctions {

    private TechnologyRequirementFunctions() {}

  }

  public static interface IConstraintRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("83707576-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface IConstraintRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConstraintRequirementFunctionsImpl implements IConstraintRequirementFunctionsImpl {

    public static final IConstraintRequirementFunctionsImpl INSTANCE = new ConstraintRequirementFunctionsImpl();

    private ConstraintRequirementFunctionsImpl() {}

  }
  
  public static class ConstraintRequirementFunctions {

    private ConstraintRequirementFunctions() {}

  }

  public static interface IQualityRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8d307dfe-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface IQualityRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QualityRequirementFunctionsImpl implements IQualityRequirementFunctionsImpl {

    public static final IQualityRequirementFunctionsImpl INSTANCE = new QualityRequirementFunctionsImpl();

    private QualityRequirementFunctionsImpl() {}

  }
  
  public static class QualityRequirementFunctions {

    private QualityRequirementFunctions() {}

  }

  public static interface ISecurityRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("991477f1-0dd1-11e6-a33d-238391a68770")
    public java.lang.String GetRequirementType();

  }
  
  public static interface ISecurityRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityRequirementFunctionsImpl implements ISecurityRequirementFunctionsImpl {

    public static final ISecurityRequirementFunctionsImpl INSTANCE = new SecurityRequirementFunctionsImpl();

    private SecurityRequirementFunctionsImpl() {}

  }
  
  public static class SecurityRequirementFunctions {

    private SecurityRequirementFunctions() {}

  }

  public static interface IRequirementStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("74bc6aa9-3d28-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetStateName();

  }
  
  public static interface IRequirementStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("74bc6aa9-3d28-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetStateName(final cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState requirementState);

  }
  
  public static class RequirementStateFunctionsImpl implements IRequirementStateFunctionsImpl {

    public static final IRequirementStateFunctionsImpl INSTANCE = new RequirementStateFunctionsImpl();

    private RequirementStateFunctionsImpl() {}

    @Override
    public java.lang.String GetStateName(final cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState requirementState) {
      if(requirementState.isRejected__F___N_QS__O_()) {
          		return "Rejected";
          	}
          	if (requirementState.isApproved__F___N_By__F_Supplier__O_()) {
          		return "Approved";
          	}
          	return requirementState.selectName();
    }

  }
  
  public static class RequirementStateFunctions {

    private RequirementStateFunctions() {}

    public static java.lang.String GetStateName(final cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState requirementState) {
      return DynamicResourceUtil.invoke(IRequirementStateFunctionsImpl.class, RequirementStateFunctionsImpl.INSTANCE, requirementState).GetStateName(requirementState);
    }

  }

  public static interface IPriorityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8a7bd03-3d2a-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetPriorityName();

  }
  
  public static interface IPriorityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b8a7bd03-3d2a-11e6-ae46-774fb9bfeae7")
    public java.lang.String GetPriorityName(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority);

  }
  
  public static class PriorityFunctionsImpl implements IPriorityFunctionsImpl {

    public static final IPriorityFunctionsImpl INSTANCE = new PriorityFunctionsImpl();

    private PriorityFunctionsImpl() {}

    @Override
    public java.lang.String GetPriorityName(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
       if(priority.isWon__M_t__F_have()) {
         return "";
       }
       return priority.selectName();
    }

  }
  
  public static class PriorityFunctions {

    private PriorityFunctions() {}

    public static java.lang.String GetPriorityName(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).GetPriorityName(priority);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6f7a099f-c90b-11e5-a64e-a5d84d8f1b45,xMk+DdVmRAESUo0dGbEaC+zwYN8=] */