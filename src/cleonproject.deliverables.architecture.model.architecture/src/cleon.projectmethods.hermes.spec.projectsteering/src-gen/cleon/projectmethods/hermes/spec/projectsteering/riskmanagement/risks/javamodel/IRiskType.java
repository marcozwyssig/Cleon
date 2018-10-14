package cleon.projectmethods.hermes.spec.projectsteering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRiskType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c8f9d029-3394-11e6-94cd-fbf6c8ccd08d");
  
  public static interface IValueVoidVisitor {
    
    public void visitRisk();
    
    public void visitChance();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRisk();
    
    public R visitChance();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRisk();
  
  public boolean isChance();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c8f9d029-3394-11e6-94cd-fbf6c8ccd08d,Q9AHb8M8b8NaZTQ6u1oxrfe5ONw=] */