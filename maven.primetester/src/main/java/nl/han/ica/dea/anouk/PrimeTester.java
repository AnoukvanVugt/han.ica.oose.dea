package nl.han.ica.dea.anouk;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimeTester implements Runnable {

    NumberUnderTest numberUnderTest;
    int highestNumberToTest;

    public PrimeTester(NumberUnderTest numberUnderTest, int highestNumberToTest) {
        this.numberUnderTest = numberUnderTest;
        this.highestNumberToTest = highestNumberToTest;
    }

    public void startTesting() throws OuchIFoundThirtySevenAndHenceMustDieException {

        while (true) {

            int number = numberUnderTest.getNumber();

            if (number > highestNumberToTest){
                break;
            }

//            boolean isPrime = Primes.isPrime(number);

            if (number == 37) {
                throw new OuchIFoundThirtySevenAndHenceMustDieException();
            }

            if (isPrime(number)) {
                System.out.println(Thread.currentThread().getId() + " found a prime number: " + number);
            }

        }
    }

    @Override
    public void run() {
        try {
            startTesting();
        } catch (OuchIFoundThirtySevenAndHenceMustDieException e) {
            System.out.println("DIE MOTHERFUCKER DIE!!!");
        }
    }
}
