package unitTest.com.jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Harun on 20.04.2019.
 * Diğer testleri grup halinde çalıştırmak için kullanıcaz.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertTest.class,
        EasyParameterTest.class,
        ParameterTest.class,
        ExceptionTest.class,
        LifeCycle.class

})
public class SuiteTest {

}
