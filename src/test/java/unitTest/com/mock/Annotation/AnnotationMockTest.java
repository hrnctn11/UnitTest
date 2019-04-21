package unitTest.com.mock.Annotation;

import io.codearte.catchexception.shade.mockito.InjectMocks;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import unitTest.com.mock.DummyCustomerService;

/**
 * Created by Harun on 21.04.2019.
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationMockTest {

    //@InjectMocks ile diğer mocklarbunun içine set edilir.

    @Mock
    private DummyCustomerService service;

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
