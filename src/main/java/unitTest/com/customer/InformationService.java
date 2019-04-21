package unitTest.com.customer;

import unitTest.com.exception.MailServerUnavaibleException;

/**
 * Created by Harun on 20.04.2019.
 */
public class InformationService {

    public void sendWeeklyMail(){
        throw new MailServerUnavaibleException("mail Server hata veriyor.");
    }
}
