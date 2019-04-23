package unitTest.com.assertj;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Harun on 23.04.2019.
 */
public class CustomerTest {

    List<String> turkishCities= new ArrayList<String>(Arrays.asList("istanbul","ankara","izmir","karabük"));

    List<String> abroadCities= new ArrayList<String>(Arrays.asList("milano","madrid","barcelona","londra"));


    @Test
    public void testStrings() throws Exception {
        String text1="istanbul";


        assertThat(text1)
                .describedAs("bu bir hata")
                .isEqualTo("istanbul")
                .startsWith("is")
                .endsWith("l")
                .contains("tan")
                .isNotEmpty()
                .isNotNull()
                .doesNotContain("harun")
                .containsOnlyOnce("tan")
               ;


    }

    @Test
    public void testBasicLists() throws Exception {

        List<String> city= new ArrayList<String>(Arrays.asList("istanbul","ankara","izmir","karabük"));


        assertThat(city)
                   .describedAs("bu bir hata ")
                   .contains("ankara")
                   .doesNotContain("bursa")
                   .contains("istanbul", "ankara", "izmir", "karabük")
                   .doesNotHaveDuplicates()
                   ;

        //listemde sadece türk şehirleri olsun
        List<String> city2= new ArrayList<String>(Arrays.asList("istanbul","ankara","izmir","karabük"));

        assertThat(city2)
                .have(turkCities());


        //listemde sadece yabancı şehirleri olsun
        List<String> city3=  new ArrayList<String>(Arrays.asList("milano","madrid","barcelona","londra"));

        assertThat(city3)
                .have(foreignCities());

        //listemde sadece hem  yabancı hem türk şehirleri olsun
        List<String> city4=  new ArrayList<String>(Arrays.asList("istanbul","ankara","madrid","barcelona","londra"));

        assertThat(city4)
                .haveExactly(2,turkCities()) // 2 tanesi bu koşula uyacak
                .haveExactly(3,foreignCities()); //3 tanesi bu koşula uyacak


    }

    private Condition<? super String> foreignCities() {
        return new Condition<String>(){
            @Override
            public boolean matches(String s) {
                return  abroadCities.contains(s);
            }
        };
    }

    private Condition<? super String> turkCities() {
        return new Condition<String>(){
            @Override
            public boolean matches(String s) {
                return  turkishCities.contains(s);
            }
        };


    }
}
