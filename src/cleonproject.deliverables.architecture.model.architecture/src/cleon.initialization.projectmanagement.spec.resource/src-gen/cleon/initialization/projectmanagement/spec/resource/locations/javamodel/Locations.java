package cleon.initialization.projectmanagement.spec.resource.locations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Locations extends DynamicResource implements ILocations {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocations> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocations>() {
    
    @Override
    public ILocations create() {
      return new Locations();
    }
    
    @Override
    public ILocations create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Locations(resourceRepository, resource);
    }
  
  };

  public Locations() {
    super(ILocations.TYPE_ID);
  }
  
  public Locations(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILocations.TYPE_ID);
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

  public Locations setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation> selectLocations() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation.class, cleon.initialization.projectmanagement.spec.resource.locations.LocationsPackage.Locations_locations);
  }

  public Locations setLocations(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation> locations) {
    _setList(cleon.initialization.projectmanagement.spec.resource.locations.LocationsPackage.Locations_locations, locations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Locations setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation.class, cleon.initialization.projectmanagement.spec.resource.locations.LocationsPackage.Locations_locations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocations selectToMeLocations(cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocations.class, cleon.initialization.projectmanagement.spec.resource.locations.LocationsPackage.Locations_locations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0de22a0b-c768-11e5-b3f9-43c5a0896ea1,FqA+fQPwHsifk9KCjrxUTer4uLM=] */