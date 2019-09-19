package cleon.modelinglanguages.network.spec.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SegmentZone extends DynamicResource implements ISegmentZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISegmentZone>() {
    
    @Override
    public ISegmentZone create() {
      return new SegmentZone();
    }
    
    @Override
    public ISegmentZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SegmentZone(resourceRepository, resource);
    }
  
  };

  public SegmentZone() {
    super(ISegmentZone.TYPE_ID);
  }
  
  public SegmentZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISegmentZone.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone> selectAllowed() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_allowed);
  }

  public SegmentZone setAllowed(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone> allowed) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_allowed, allowed);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone> selectSecurityZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_securityZones);
  }

  public SegmentZone setSecurityZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone> securityZones) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_securityZones, securityZones);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SegmentZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones);
  }

  public SegmentZone setZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_allowed, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_securityZones, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone selectToMeSecurityZones(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_securityZones, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone> selectToMeAllowed(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SegmentZone_allowed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e820f880-0b73-11e9-a136-69d076e48ed1,UU5JB5y7l9COBJWLHI9hDapMBjo=] */
