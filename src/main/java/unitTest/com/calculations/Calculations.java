package unitTest.com.calculations;

/**
 * Hello Calculations!
 *
 */
public class Calculations
{
    public static void main( String[] args )
    {
        System.out.println("total ="+ total(5,10) );
        System.out.println("extraction ="+ extraction(5, 10) );
    }

    public static int total(int number1, int number2){
        return number1+number2;
    }

    public static int extraction(int number1,int number2) {
        return number2-number1;
    }

    public static int calculateSquareMeter(int width,int height){
        return width * height;
    }



}
