package nl.han.dea.anouk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        var app = new App();
        try {
            app.performFizzBuzz();
        } catch (UglyNumberException e) {
            e.printStackTrace();
        }
    }

    private void performFizzBuzz() throws UglyNumberException {
        for (int i = 0; i < 10; i++) {
            doFizzBuzz("" + 1);
        }
    }

    public void doFizzBuzz(String number) throws UglyNumberException {
        if (number.equals("3")) {
            System.out.println("Fizz");
        } else if (number.equals("5")) {
            System.out.println("Buzz");
        } else if (number.equals("6")) {
            throw new PerfectNumberException();
        } else if (number.equals("7")) {
            throw new UglyNumberException();
        }
    }
}
