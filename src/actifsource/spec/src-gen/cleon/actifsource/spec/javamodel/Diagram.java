package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Diagram extends DynamicResource implements IDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDiagram>() {
    
    @Override
    public IDiagram create() {
      return new Diagram();
    }
    
    @Override
    public IDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Diagram(resourceRepository, resource);
    }
  
  };

  public Diagram() {
    super(IDiagram.TYPE_ID);
  }
  
  public Diagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDiagram.TYPE_ID);
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
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.actifsource.spec.SpecPackage.Project_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.actifsource.spec.SpecPackage.Project_version, version);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IProject> selectDependsOn() {
    return _getList(cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.Project_dependsOn);
  }

  public Diagram setDependsOn(java.util.List<? extends cleon.actifsource.spec.javamodel.IProject> dependsOn) {
    _setList(cleon.actifsource.spec.SpecPackage.Project_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Diagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.actifsource.spec.SpecPackage.Project_version, visitor);
    // relations
    _acceptList(cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.Project_dependsOn, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f1d5fec5-3f8d-11e5-9616-473ab9b9a1f3,qrElj5fccO2Ndfdcea6G7bxkNSE=] */
