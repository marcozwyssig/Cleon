package cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecuritySubZone extends DynamicResource implements ISecuritySubZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecuritySubZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecuritySubZone>() {
    
    @Override
    public ISecuritySubZone create() {
      return new SecuritySubZone();
    }
    
    @Override
    public ISecuritySubZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecuritySubZone(resourceRepository, resource);
    }
  
  };

  public SecuritySubZone() {
    super(ISecuritySubZone.TYPE_ID);
  }
  
  public SecuritySubZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecuritySubZone.TYPE_ID);
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
  public cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification.class, cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification);
  }

  public SecuritySubZone setClassification(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification classification) {
    _setSingle(cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification, classification);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone selectNoZones() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SecuritySubZone_noZones);
  }

  public SecuritySubZone setNoZones(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone noZones) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SecuritySubZone_noZones, noZones);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecuritySubZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone> selectZones() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Zone_zones);
  }

  public SecuritySubZone setZones(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone> zones) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.resources.confidentiality.javamodel.IClassification.class, cleon.common.resources.spec.resources.confidentiality.ConfidentialityPackage.ClassificationAware_classification, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SecuritySubZone_noZones, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.Zone_zones, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecuritySubZone selectToMeNoZones(cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.IZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISecuritySubZone.class, cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.SegmentationPackage.SecuritySubZone_noZones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f40c131-0b75-11e9-a136-69d076e48ed1,+rE8VTkmmAsnFiHeBtT5U+6xue0=] */