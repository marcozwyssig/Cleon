package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemRuntimeView extends DynamicResource implements ISystemRuntimeView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemRuntimeView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemRuntimeView>() {
    
    @Override
    public ISystemRuntimeView create() {
      return new SystemRuntimeView();
    }
    
    @Override
    public ISystemRuntimeView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemRuntimeView(resourceRepository, resource);
    }
  
  };

  public SystemRuntimeView() {
    super(ISystemRuntimeView.TYPE_ID);
  }
  
  public SystemRuntimeView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemRuntimeView.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemRuntimeView setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationView selectCommunication() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationView.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_communication);
  }

  public SystemRuntimeView setCommunication(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationView communication) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_communication, communication);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemRuntimeView setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteractionView selectInteraction() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteractionView.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_interaction);
  }

  public SystemRuntimeView setInteraction(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteractionView interaction) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_interaction, interaction);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemRuntimeView setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemRuntimeView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationView.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_communication, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteractionView.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_interaction, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.javamodel.ISystemRuntimeView selectToMeCommunication(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.javamodel.ISystemRuntimeView.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_communication, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.javamodel.ISystemRuntimeView selectToMeInteraction(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.interaction.javamodel.IInteractionView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.javamodel.ISystemRuntimeView.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view._06_runtime_viewPackage.SystemRuntimeView_interaction, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a5c76a26-480f-11ea-8815-a3c0ce8e776e,yMwbRqmRjL2KXmNwdYoGQ3PXzoM=] */