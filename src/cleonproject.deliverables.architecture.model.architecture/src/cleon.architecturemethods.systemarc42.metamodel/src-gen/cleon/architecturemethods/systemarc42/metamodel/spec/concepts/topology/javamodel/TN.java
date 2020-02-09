package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TN extends DynamicResource implements ITN {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITN> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITN>() {
    
    @Override
    public ITN create() {
      return new TN();
    }
    
    @Override
    public ITN create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TN(resourceRepository, resource);
    }
  
  };

  public TN() {
    super(ITN.TYPE_ID);
  }
  
  public TN(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITN.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectFunctionID() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractSiteWithFunctionID_functionID);
  }
    
  public void setFunctionID(java.lang.Integer functionID) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractSiteWithFunctionID_functionID, functionID);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN> selectHss() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_hss);
  }

  public TN setHss(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN> hss) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_hss, hss);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN> selectMss() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_mss);
  }

  public TN setMss(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN> mss) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_mss, mss);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite> selectSubsite() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractSiteComposition_subsite);
  }

  public TN setSubsite(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite> subsite) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractSiteComposition_subsite, subsite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITDM> selectTdm() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITDM.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_tdm);
  }

  public TN setTdm(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITDM> tdm) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_tdm, tdm);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TN setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.AbstractSiteWithFunctionID_functionID, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_hss, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_mss, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITDM.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_tdm, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITN selectToMeMss(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_mss, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITN selectToMeHss(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IRN object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_hss, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITN selectToMeTdm(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITDM object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITN.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.TN_tdm, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c0a851b6-9286-11e9-959e-8115c2f9e41e,i+BISHjslVHWPTq7bJyYUsjgSrE=] */