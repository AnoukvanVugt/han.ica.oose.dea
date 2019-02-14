package nl.han.ica.dea.anouk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StringCalculator stringCalculator = new StringCalculator();
        try {
            stringCalculator.add("");
        } catch (NegativeNumberException e) {
            System.out.println("No negative numbers please!");
        }
    }
}
