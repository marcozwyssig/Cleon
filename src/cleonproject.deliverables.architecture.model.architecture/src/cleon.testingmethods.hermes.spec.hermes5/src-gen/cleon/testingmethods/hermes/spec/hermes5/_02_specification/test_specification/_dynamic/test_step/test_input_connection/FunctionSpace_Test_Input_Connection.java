package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[012ce424-6d6e-11e9-b84d-d319514e887f,imports]] */

/* End Protected Region   [[012ce424-6d6e-11e9-b84d-d319514e887f,imports]] */

public class FunctionSpace_Test_Input_Connection {

  /* Begin Protected Region [[012ce424-6d6e-11e9-b84d-d319514e887f]] */
  
  /* End Protected Region   [[012ce424-6d6e-11e9-b84d-d319514e887f]] */


  public static interface ITestInputConnectionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0cb43ed4-6d6e-11e9-b84d-d319514e887f")
    public java.lang.String GetName();

  }
  
  public static interface ITestInputConnectionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputConnectionFunctionsImpl implements ITestInputConnectionFunctionsImpl {

    public static final ITestInputConnectionFunctionsImpl INSTANCE = new TestInputConnectionFunctionsImpl();

    private TestInputConnectionFunctionsImpl() {}

  }
  
  public static class TestInputConnectionFunctions {

    private TestInputConnectionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,012ce424-6d6e-11e9-b84d-d319514e887f,fR4LUE9ZyC1uM85K1zcnK5iFxds=] */