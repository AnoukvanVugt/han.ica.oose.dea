package nl.han.ica.dea.anouk;

import org.junit.Test;
import org.junit.gen5.api.Assertions;

public class AdderTest {
    Adder adder;

    @before
    void setup() {
        adder = new Adder();
    }

    @Test
    void testIfEmptyStringReturnsZero() {
        //Setup

        //Test
        int addedNumber = adder.add("");

        //Verify
        Assertions.assertEquals(0,addedNumber);
    }

    @Test
    void testIfStringWithOneNumberReturnsOneNumber() {
        int addedNumber = adder.add("1");

        Assertions.assertEquals(1,addedNumber);
    }

    @Test
    void testIfStringWithOtherNumberReturnsOtherNumber() {
        int addedNumber = adder.add("37");

        Assertions.assertEquals(37,addedNumber);
    }

    @Test
    void testIfSimpleSeperatorWorks() {
        int addedNumber = adder.add("0,37");

        Assertions.assertEquals(37,addedNumber);
    }
}