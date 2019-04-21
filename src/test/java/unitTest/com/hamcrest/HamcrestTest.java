package unitTest.com.hamcrest;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Harun on 21.04.2019.
 */
public class HamcrestTest {


    /**
     *Temel Eşleştirmeler
     * Bu eşleştiriciler, JUnit ve jMock gibi birim test çerçevelerinde kullanımlara sahiptir.
     * Kodun okunabilirliğini ve daha kısa sürede daha çok iş yapılabilirliğini arttırırlar.
     */
    @Test
    public void testBaseMatching() throws Exception {

        String text1="Harun";
        String text2="Harun2";
        String text3=null;
       // assertEquals("Harun",text1);

        assertThat(text1,is(equalTo("Harun")));
        assertThat(text3,is(nullValue()));
        assertThat(text1,is(notNullValue()));
        assertThat(text1,containsString("run"));

        //or  herhangi birisi olursa olumlu sonuc vericektir.
        assertThat(text1,anyOf(containsString("Ha"),containsString("kar")));


    }

    /**
     * Listeler hakkında testler
     * @throws Exception
     */
    @Test
    public void testLists() throws Exception {
        List<String> citys= new ArrayList<String>(Arrays.asList("Istanbul", "Ankara", "Izmir"));

        assertThat(citys,hasItem("Istanbul"));
        assertThat(citys,hasItems("Istanbul", "Ankara"));
        //and
        assertThat(citys,allOf( hasItems("Istanbul", "Ankara"),not(hasItem("Bursa")) ));

        //either or (ya şu olsun yada bu olsun)
        assertThat(citys,either( hasItems("Istanbul", "Ankara")).or(not(hasItem("Bursa"))) );

    }
}
