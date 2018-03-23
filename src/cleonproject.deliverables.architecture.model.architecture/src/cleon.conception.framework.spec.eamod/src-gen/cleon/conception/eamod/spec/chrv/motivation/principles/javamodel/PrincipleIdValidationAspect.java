package cleon.conception.eamod.spec.chrv.motivation.principles.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class PrincipleIdValidationAspect extends BusinessObjectIdUniqueValidationAspect<IPrinciple> 
{
	public PrincipleIdValidationAspect()
	{
		super(IPrinciple.class);
	}
}