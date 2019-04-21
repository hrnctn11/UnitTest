package unitTest.com.jUnit;

import org.junit.*;

/**
 * Created by Harun on 20.04.2019.
 */
public class LifeCycle {

    @BeforeClass
     public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass class çalışmadan önce 1 kez çalışır.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass class işi bitince 1 kez  çalışır. ");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before Her testten Önce çalışır. ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After Her testten Sonra çalışır. ");
    }

    @Test
    public void testName() throws Exception {
        System.out.println( "1.Test çalıştı");
    }

    @Test
    public void testName2() throws Exception {
        System.out.println( "2.Test çalıştı");
    }
}
