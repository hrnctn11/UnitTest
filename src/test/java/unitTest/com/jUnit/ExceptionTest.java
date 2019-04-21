package unitTest.com.jUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unitTest.com.customer.InformationService;
import unitTest.com.exception.MailServerUnavaibleException;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;

/**
 * Created by Harun on 20.04.2019.
 */
public class ExceptionTest {
    private InformationService service=new InformationService();


    /**
     * Tray catch ile hatayı yakalıyoruz bu hatanın hangi tipte ve ne hatası oldunu doğruluyoruz.
     * @throws Exception
     */
    @Test
    public void testTryCatchException() throws Exception {
        try {
            service.sendWeeklyMail();
        }catch (Exception ex){
            Assert.assertTrue(ex instanceof MailServerUnavaibleException);
            Assert.assertEquals("mail Server hata veriyor.",ex.getMessage());
        }

    }


    /**
     *Bu metodu çalıştırdığımda hata bekliyorum ve bu hata expected ekindeki verdiğim hata olması gerekiyor.
     * Hata mesajını bununla kontrol edemeyız
     * @throws Exception
     */
    @Test(expected = MailServerUnavaibleException.class)
    public void testExceptedException() throws Exception {
        service.sendWeeklyMail();
    }


    /**
     * Rule anatasyonunu kullanıyoruz. Bunun ile beklenilen hataları belirtiyoruz sonra servisi çağrıyoruz.Sonradan junit tarafından kontrol ediliyor.
     */
    @Rule
    public ExpectedException thrown=ExpectedException.none();

    @Test
    public void testRuleException() throws Exception {
        thrown.expect(MailServerUnavaibleException.class);
        thrown.expectMessage("mail Server hata veriyor.");

        service.sendWeeklyMail();
    }


    /**CatchException adındaki farklı bir kütüphane.
     * catchException ile servis çağrılır ardından  yakalanan hatayı istediğimiz
     * şekilde kullanıp sorguları gerçekleştirebiliriz.
     *
     * @throws Exception
     */
    @Test
    public void testCatchExceptionFramework() throws Exception {
        catchException(service).sendWeeklyMail();
        Assert.assertTrue(caughtException() instanceof MailServerUnavaibleException);
        Assert.assertEquals("mail Server hata veriyor.",caughtException().getMessage());
    }
}
