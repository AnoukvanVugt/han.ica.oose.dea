package nl.han.ica.dea.anouk;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    void setup() {
       stringCalculator = new StringCalculator();
    }

    @Test
    void ifEmptyStringReturnZero() throws NegativeNumberException {
        //setup

        //test
        int calculatedNumber = stringCalculator.add("");
        //verify
        assertEquals(0,calculatedNumber);
    }

    @Test
    void ifOneNumberReturnOneNumber() throws NegativeNumberException {
        //setup

        //test
        int calculatedNumber = stringCalculator.add("1");
        //verify
        assertEquals(1, calculatedNumber);
    }

    @Test
    void ifTwoNumbersReturnSum() throws NegativeNumberException {
        //setup

        //test
        int calculatedNumber = stringCalculator.add("1,2");
        //verify
        assertEquals(3, calculatedNumber);
    }

    @Test
    void ifRandomAmountOfNumbersReturnSum() throws NegativeNumberException {
        //setup

        //test
        int calculatedNumber = stringCalculator.add("1,2,3,4,5");
        int calculatedNumber2 = stringCalculator.add("1,2,3");
        //verify
        assertEquals(15, calculatedNumber);
        assertEquals(6, calculatedNumber2);
    }

    @Test
    void ifOtherSplitterUsedReturnSum() throws NegativeNumberException {
        //setup

        //test
        int calculatedNumber = stringCalculator.add("1\n2,3");
        //verify
        assertEquals(6, calculatedNumber);
    }

    @Test
    void customSplitterUsedReturnSum() throws NegativeNumberException {
        //setup

        //test
        int calculatedNumber = stringCalculator.add("//;\n1;2");
        //verify
        assertEquals(3, calculatedNumber);
    }

    @Test
    void negativeNumbersUsedThrowsException() {
        //setup

        //test

        //verify
        assertThrows(NegativeNumberException.class, () -> {
            stringCalculator.add("-1,1,2");
        });
    }
}
