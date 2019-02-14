package nl.han.ica.dea.anouk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 2000;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();

    }

    private synchronized void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        var aantalTesters = 4;

        IntStream.range(0, aantalTesters).forEach(i -> createAndStartThread(numberUnderTest));

    }

    private void createAndStartThread(NumberUnderTest numberUnderTest) {
        new Thread(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST)).start();
    }
}
