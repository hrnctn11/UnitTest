package unitTest.com.mock;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;
/**
 * Created by Harun on 21.04.2019.
 */
public class BehaviourTest {

    @Test
    public void testBehaviour() throws Exception {

        DummyCustomerService customerService=mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("ankara");

        //bu servisin bu customerlar ile çağrılması gerektiği kontrol ediliyor
        verify(customerService).addCustomer("Istanbul");
        verify(customerService).addCustomer("ankara");

    }

    @Test
    public void testHowManyTimesWasCalled() throws Exception {

        DummyCustomerService customerService=mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Istanbul");
        customerService.addCustomer("ankara");
        customerService.addCustomer("Istanbul");


        //bu servisin bu customerlar ile kaç kere çağrılması gerektiğini kontrol eder.
        verify(customerService,times(3)).addCustomer("Istanbul");
        verify(customerService,times(1)).addCustomer("ankara");//yazmasakta default 1 davranışı  1 kez olarak kontrol eder.

        //removeCustomer hiç bir zaman çağrılmadı parametre fark etmez
        verify(customerService,never()).removeCustomer(anyString());

        //izmir kullanıcısı hiç eklenmedi
        verify(customerService,never()).addCustomer("izmir");

        //en az iki kere çağrıldı
        verify(customerService,atLeast(2)).addCustomer("Istanbul");
    }

    @Test
    public void testDoSequenceControl() throws Exception {
        DummyCustomerService customerService=mock(DummyCustomerService.class);

        //verildği sırada çağrılsın
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");
        customerService.updateCustomer("izmir");

        InOrder inOrder = inOrder(customerService);//istediğimiz kadar mock nesnesi verebiliriz

        inOrder.verify(customerService).addCustomer("istanbul"); //1
        inOrder.verify(customerService).addCustomer("ankara");   //2
        inOrder.verify(customerService).updateCustomer("izmir"); //3

    }


    @Test
    public void testNoOtherControl() throws Exception {

        DummyCustomerService customerService=mock(DummyCustomerService.class);
        DummyCustomerService customerService2=mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("ankara");
       // customerService.addCustomer("izmir");  // hata verifyNoMoreInteractions

       // customerService2.addCustomer("ankara");  // hata verifyZeroInteractions


        //bu servisin bu customerlar ile çağrılması gerektiği kontrol ediliyor
        verify(customerService).addCustomer("Istanbul");
        verify(customerService).addCustomer("ankara");


        verifyNoMoreInteractions(customerService);//yukarıda üzerinde kontroller yapılanlar dışında başka çağrı olmasın

        verifyZeroInteractions(customerService2);//hiç bir şekilde çağrılma olmasın bu nesne için

    }
}
