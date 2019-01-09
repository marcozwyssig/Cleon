package cleon.common.resources.spec.resources.id.javamodel;

import java.util.List;
import java.util.stream.Collectors;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.common.resources.spec.resources.id.IdPackage;

public class BusinessObjectIdUniqueValidationAspect<T extends IIntegerBusinessObjectId> implements IResourceValidationAspect {

	private Class<T> _classInstance;

	protected BusinessObjectIdUniqueValidationAspect(Class<T> classInstance) {
		_classInstance = classInstance;
	}
	
	protected List<T> getResources(IDynamicResourceRepository resourceRepository, ValidationContext context) 
	{
		return resourceRepository.getAllResources(_classInstance);
	}
	
	
	protected T getObject( IDynamicResourceRepository resourceRepository, ValidationContext context)
	{
		return resourceRepository.getResource(_classInstance, context.getResource());
	}

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		List<T> resources = getResources(resourceRepository, context);
		T businessObjectId = getObject(resourceRepository, context);

		List<T> duplicateItems = resources.stream()
				.filter(x -> x.selectIdentifier().equals(businessObjectId.selectIdentifier()))
				.collect(Collectors.toList());
		if (!duplicateItems.isEmpty() && duplicateItems.size() != 1) {
			String name = Select.simpleName(context.getReadJobExecutor(), businessObjectId.getResource());
			String errormessage = String.format("Resource %1$s with id %2$d is not unique", name,
					businessObjectId.selectIdentifier());
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
					IdPackage.IntegerBusinessObjectId_identifier, errormessage));
		}

	}
}
