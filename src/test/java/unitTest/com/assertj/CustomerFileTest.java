package unitTest.com.assertj;

import javafx.application.Application;
import org.junit.Test;
import unitTest.com.exception.MailServerUnavaibleException;

import java.io.File;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by Harun on 23.04.2019.
 */
public class CustomerFileTest {

    @Test
    public void testFiles() throws Exception {

        File file = new File(getClass().getClassLoader().getResource("test.txt").getFile());

        assertThat(file)
                .exists()
                .canRead()
                .canWrite()
                .hasExtension("txt")
                .hasName("test.txt");

        assertThat(contentOf(file))
                .startsWith("Biz");

    }

    @Test
    public void testException() throws Exception {
        Exception exception= new MailServerUnavaibleException("this is a test");
        assertThat(exception)
                .hasMessage("this is a test")
                .isInstanceOf(MailServerUnavaibleException.class)
                .hasMessageContaining("is a");

    }
}
