package unitTest.com.assertj;

import org.junit.Test;

/**
 * Created by Harun on 23.04.2019.
 */
public class LombokTest {

    @Test
    public void testLombok() throws Exception {

        Gift gift=new Gift("Harun");
        System.out.println(gift.toString());

    }

    @Test
    public void testLombokBuilder() throws Exception {

        GiftBuilder gift= GiftBuilder.builder().name("harun").surname("cetin").build();
        System.out.println(gift.toString());

    }


}
