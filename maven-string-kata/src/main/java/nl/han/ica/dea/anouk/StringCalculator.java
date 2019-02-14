package nl.han.ica.dea.anouk;


public class StringCalculator {

    public int add(String numbers) throws NegativeNumberException {
        if ("".equals(numbers)) {
            return 0;
        }
        var part = 0;
        if (numbers.startsWith("//")) {
            numbers = numbers.substring(2);
            String[] parts = numbers.split("\n");
            var delimiter = parts[0];
            String[] numberParts = parts[1].split(delimiter);
            part = getPart(part, numberParts);

        } else {
            String[] parts = numbers.split(",|\n");
            part = getPart(part, parts);
        }
        return part;
    }

    private int getPart(int part, String[] numberParts) throws NegativeNumberException {
        for (int i = 0; i < numberParts.length; i++) {
            if (Integer.parseInt(numberParts[i]) < 0) {
                throw new NegativeNumberException();
            }
            part = part + Integer.parseInt(numberParts[i]);
        }
        return part;
    }
}