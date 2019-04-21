package unitTest.com.mock.Annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import unitTest.com.mock.DummyCustomerServiceImpl;

/**
 * Created by Harun on 21.04.2019.
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationSpyTest {

    @Spy
    private DummyCustomerServiceImpl service;

    /**
     * Aşağıdaki yerine @Mock Annotationını ekledik yukarıya clas başınada RunWith Annotationını ekledik .
     *
     */
//    @Before
//    public void setUp() throws Exception {
//        service= Mockito.mock(DummyCustomerService.class);
//
//    }

    @Test
    public void testAnotation() throws Exception {
        service.addCustomer("istanbul");

    }
}
