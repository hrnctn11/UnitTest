package unitTest.com.jUnit;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Harun on 20.04.2019.
 * Assert = İddaa
 */
public class AssertTest {

    @Test
    public void testAssetions() throws Exception {

        Dummy dummy=new Dummy(10);
        Dummy dummy2=new Dummy(10);
        Dummy dummyNull=null;

        String [] arr1=new String[]{"1","2"};
        String [] arr2=new String[]{"1","2"};


        /**
         * Hepsinin soluna hata mesajı eklenebilir.  Veya olmadan kullanılabilir.
         */
        assertEquals("Hata Mesajı: İki nesne birbirine eşit olmalıdır.",dummy, dummy2);
        assertNull("Hata Mesajı : Beklenen değer null.",dummyNull);
        assertNotNull("Hata Mesajı : Beklenen değer not null.", dummy);
        assertTrue(null==dummyNull);
        assertFalse(dummy==null);
        assertArrayEquals(arr1,arr2);
    }

    private static class Dummy{

        public Dummy(Integer id) {
            this.id = id;
        }

        private Integer id;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }


        /**
         * Normalde iki nesne eşit olmaz.
         * Eşitlik durumunda idler ile karşılaştırma yapmasını sağlıyoruz.
         */
        @Override
        public boolean equals(Object o) {
            return this.id==((Dummy) o).getId();
        }

    }
}
