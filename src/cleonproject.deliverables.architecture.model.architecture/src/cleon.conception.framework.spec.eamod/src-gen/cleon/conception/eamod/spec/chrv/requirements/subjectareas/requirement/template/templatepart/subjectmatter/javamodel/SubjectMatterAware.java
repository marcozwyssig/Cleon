package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SubjectMatterAware extends DynamicResource implements ISubjectMatterAware {

  // abstract implementation, only used for static method calls
  private SubjectMatterAware() {
    super(ISubjectMatterAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatterAware> selectToMeSubjectMatter(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatterAware.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ed1a8e0c-d656-11e5-beff-c5494779b7d9,sAJim8qBEsZ40LnWM8c9hx7lqlc=] */
