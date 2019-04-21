package unitTest.com.calculations;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple calculations.
 */
public class CalculationsTest {

    /**
     * Rigorous Test :-)
     ** Unit Test Yazma Kuralları**
     * <p>
     * En küçük parçacığı test etmeli
     * <p>
     * Sadece bir senaryo test edilir
     * <p>
     * Kullanılan adınlar Given-When-Then
     * <p>
     * Test metodunun ismi test edilen senaryoyu yatsıtmalı
     * <p>
     * Test edilen parça diğer parçalardan bağımsız olmalı (muck,stop)
     *
     * Diğer testlerden bağımsız çalışabilmeli
     *
     * Tam Otomatik
     *
     * Hızlı çalışabilmeli ve çabuk sonuçlar vermeli
     *
     * Okunaklı anlaşılabilir ve sürdürülebilir olmalı
     *
     *
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    Calculations calculations;

    @Before
    public void setUp() throws Exception {
        //Aynı işlemi hepsinde yaptığım için burada bir kere yapıcam şimdi

        //Given
        calculations = new Calculations();

    }

    @Test
    public void given_CalculationsTotal_then_sendTwoNumber_then_ResultIsTotal() {

        //When
        int result = calculations.total(5, 10);
        //Then
        Assert.assertEquals(15, result);

    }

    @Test
    public void given_CalculationsTotal_then_sendTwoNumber_then_ResultIsExtraction() {

        //When
        int result = calculations.extraction(5, 10);
        //Then
        Assert.assertEquals(5, result);
    }


    @Test
    public void when__ExtractionFromZero_Except_ResultNegative() {

        //When
        int result = calculations.extraction(15, 0);
        //Then
        Assert.assertEquals(-15, result);


    }

    @Test
    public void when_ExtractionZero_Except_ResultSameNumber() throws Exception {
        //Given
        Calculations calculations = new Calculations();
        //When
        int result = calculations.extraction(0, 15);
        //Then
        Assert.assertEquals(15, result);
    }


}
