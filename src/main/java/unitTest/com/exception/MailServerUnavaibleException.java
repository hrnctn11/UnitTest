package unitTest.com.exception;

/**
 * Created by Harun on 20.04.2019.
 */
public class MailServerUnavaibleException extends RuntimeException {

    public MailServerUnavaibleException(String message){
        super(message);
    }
}
