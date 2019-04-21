package unitTest.com.jUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import unitTest.com.calculations.Calculations;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Harun on 20.04.2019.
 */
@RunWith(Parameterized.class)
public class ParameterTest {

    private Calculations calculations=new Calculations();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10,2,20},
                {20,2,40},
                {1,3,3},
                {1,55,55},
                {4,9,36}});
    }

    private int height;
    private int width;
    private int totalSquareMeter;

    public ParameterTest(int height, int width, int totalSquareMeter) {
        this.height = height;
        this.width = width;
        this.totalSquareMeter = totalSquareMeter;
    }



    @Test
    public void testcalculateSquareMeter() throws Exception {

       assertEquals(totalSquareMeter,calculations.calculateSquareMeter(height,width));
    }
}
