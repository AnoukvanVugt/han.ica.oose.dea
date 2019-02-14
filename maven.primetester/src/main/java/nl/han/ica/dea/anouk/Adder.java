package nl.han.ica.dea.anouk;

import org.junit.gen5.api.Assertions;

public class Adder {
    public int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        return Integer.parseInt(numbers);
    }
}
