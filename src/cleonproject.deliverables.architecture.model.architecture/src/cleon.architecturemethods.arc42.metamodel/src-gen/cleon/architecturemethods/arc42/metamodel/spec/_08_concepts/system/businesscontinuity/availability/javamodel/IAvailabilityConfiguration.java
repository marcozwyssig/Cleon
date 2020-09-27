package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityConfiguration extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("21408953-1e38-11e9-865e-41ef48a95f70");
  
  public static interface IValueVoidVisitor {
    
    public void visitNone();
    
    public void visitActive__S_Active();
    
    public void visitActive__S_Passive__F___N_Failover__O_();
    
    public void visitVM__F_Sicherung__F_und__F_Wiederherstellung();
    
    public void visitVM__F_Replikation();
    
    public void visitVM__F_Redundanz();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitNone();
    
    public R visitActive__S_Active();
    
    public R visitActive__S_Passive__F___N_Failover__O_();
    
    public R visitVM__F_Sicherung__F_und__F_Wiederherstellung();
    
    public R visitVM__F_Replikation();
    
    public R visitVM__F_Redundanz();
    
  }
  
  // attributes
  
  public java.util.List<java.lang.String> selectStandardDescription();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isNone();
  
  public boolean isActive__S_Active();
  
  public boolean isActive__S_Passive__F___N_Failover__O_();
  
  public boolean isVM__F_Sicherung__F_und__F_Wiederherstellung();
  
  public boolean isVM__F_Replikation();
  
  public boolean isVM__F_Redundanz();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,21408953-1e38-11e9-865e-41ef48a95f70,KjOV3LSjRHgrU13YZJpdHHbNxAw=] */
