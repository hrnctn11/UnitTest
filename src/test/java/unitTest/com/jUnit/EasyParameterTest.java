package unitTest.com.jUnit;
import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import junitparams.Parameters;
import org.junit.runner.RunWith;
import unitTest.com.calculations.Calculations;

/**
 * Created by Harun on 20.04.2019.
 */
@RunWith(JUnitParamsRunner.class)
public class EasyParameterTest {

    private Calculations calculations=new Calculations();

    @Test
    @Parameters({"10,20,200","20,20,400"})
    public void testCalculateSquareMeter(int height, int width, int totalSquareMeter) throws Exception {
        assertEquals(totalSquareMeter,calculations.calculateSquareMeter(height,width));
    }
}
