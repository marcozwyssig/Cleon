package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a132df1d-c1d2-11ea-b956-0ffede25a02d,imports]] */

/* End Protected Region   [[a132df1d-c1d2-11ea-b956-0ffede25a02d,imports]] */

public class FunctionSpace_SystemArc42_Concepts {

  /* Begin Protected Region [[a132df1d-c1d2-11ea-b956-0ffede25a02d]] */
  
  /* End Protected Region   [[a132df1d-c1d2-11ea-b956-0ffede25a02d]] */


  public static interface IBackupConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b0386477-c1d2-11ea-b956-0ffede25a02d")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> SelectBackupBuildingBlocks();

  }
  
  public static interface IBackupConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackupConceptFunctionsImpl implements IBackupConceptFunctionsImpl {

    public static final IBackupConceptFunctionsImpl INSTANCE = new BackupConceptFunctionsImpl();

    private BackupConceptFunctionsImpl() {}

  }
  
  public static class BackupConceptFunctions {

    private BackupConceptFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a132df1d-c1d2-11ea-b956-0ffede25a02d,iX94IR//s8T4HkwZAqzTa0eHNZE=] */
