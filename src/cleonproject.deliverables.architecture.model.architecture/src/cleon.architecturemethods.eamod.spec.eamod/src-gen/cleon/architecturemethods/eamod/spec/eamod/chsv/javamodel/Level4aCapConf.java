package cleon.architecturemethods.eamod.spec.eamod.chsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Level4aCapConf extends DynamicResource implements ILevel4aCapConf {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel4aCapConf> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel4aCapConf>() {
    
    @Override
    public ILevel4aCapConf create() {
      return new Level4aCapConf();
    }
    
    @Override
    public ILevel4aCapConf create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Level4aCapConf(resourceRepository, resource);
    }
  
  };

  public Level4aCapConf() {
    super(ILevel4aCapConf.TYPE_ID);
  }
  
  public Level4aCapConf(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILevel4aCapConf.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCheopsNr() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_CheopsNr);
  }
    
  public void setCheopsNr(java.lang.String cheopsNr) {
     _setSingleAttribute(cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_CheopsNr, cheopsNr);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
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
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDecommission() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_Decommission);
  }

  public Level4aCapConf setDecommission(cleon.common.resources.spec.calendar.javamodel.IDay decommission) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_Decommission, decommission);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEndOfLife() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_EndOfLife);
  }

  public Level4aCapConf setEndOfLife(cleon.common.resources.spec.calendar.javamodel.IDay endOfLife) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_EndOfLife, endOfLife);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public Level4aCapConf setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Level4aCapConf setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_CheopsNr, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_Decommission, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.architecturemethods.eamod.spec.eamod.chsv.ChsvPackage.LevelCapConf_EndOfLife, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9885f35f-a7f9-11e7-9807-4f1f5d43f7c9,n73AYagwPoJ9jlnifR5BO/ybFTw=] */