package fizzbuzz;

public class FizzBuzz {

    public String parse(int i) {
        if (i < 0) throw new IllegalArgumentException();
        if (i == 0) {
            return "0";
        }
        String valueToDisplay;
        valueToDisplay = createFizzBuzzStringFromInteger(i);
        return valueToDisplay.length() == 0 ? String.valueOf(i) : valueToDisplay;
    }

    private static String createFizzBuzzStringFromInteger(int i) {
        StringBuilder valueToDisplay = new StringBuilder();
        if ((i % 3) == 0) {
            valueToDisplay.append("Fizz");
        }
        if ((i % 5) == 0) {
            valueToDisplay.append("Buzz");
        }
        return valueToDisplay.toString();
    }
}

