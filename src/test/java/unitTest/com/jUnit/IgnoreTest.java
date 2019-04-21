package unitTest.com.jUnit;

import org.junit.Test;
import org.junit.Ignore;

/**
 * Created by Harun on 20.04.2019.
 */
public class IgnoreTest {

    @Test
    public void testHello() throws Exception {
        System.out.println("Merhaba 1");
    }

    @Test
    @Ignore("Bu metod ile ignore denendi.")
    public void testHello2() throws Exception {
        System.out.println("Merhaba 2");
    }
}
