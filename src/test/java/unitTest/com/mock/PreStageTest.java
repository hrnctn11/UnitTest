package unitTest.com.mock;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by Harun on 21.04.2019.
 */
public class PreStageTest {

    //when  -> Metod çağırma

    //then  -> Davranış şekli

    @Test
    public void testWhen() throws Exception {
        DummyCustomerService service=mock(DummyCustomerService.class);
        when(service.getCustomer(eq("istanbul"))).thenReturn("customerIstanbul"); //istanbul gönderince  customerIstanbul geri döndürsün dedik.
        // when(service.getCustomer(anyString())).thenReturn("Selam"); //herhangi bir string gönderirsek Selam geri döner.
        //bir dönüş belirtmediysek null dönecektir.

        String customer =service.getCustomer("istanbul");

        assertThat(customer).isEqualTo("customerIstanbul");

    }

    //thenThrow
    @Test
    public void testWhen2() throws Exception {
        DummyCustomerService service=mock(DummyCustomerService.class);
        when(service.getCustomer(eq("istanbul"))).thenThrow(new RuntimeException()); //istanbul  gönderince  RuntimeException atıcak


//        String customer =service.getCustomer("istanbul");

    }

    //Void metodlarında geri bildirim testi
    @Test
    public void testWhen3() throws Exception {
        //void dönen metodlarda nasıl when kullanılır.
        DummyCustomerService service=mock(DummyCustomerService.class);

        //tam tersi yazılan do ile başlayan metodlar
        doNothing().when(service).addCustomer(anyString()); //herhangi bir string için hiç bişi yapma
        //doThrow(new RuntimeException()).when(service).addCustomer(anyString()); // herhangi bir string gelince exception at
       // doReturn("ankara").when(service).getCustomer("istanbul"); //istanbul gönderince ankara döndür




    }

}
