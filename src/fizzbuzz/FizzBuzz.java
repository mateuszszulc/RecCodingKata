package fizzbuzz;

public class FizzBuzz {

    public String parse(int i) {
        if (i < 0) throw new IllegalArgumentException();
        
        String valueToDisplay;
        valueToDisplay = createFizzBuzzStringFromInteger(i);
        return valueToDisplay.length() == 0 ? String.valueOf(i) : valueToDisplay;
    }

    private static String createFizzBuzzStringFromInteger(int i) {
        StringBuilder valueToDisplay = new StringBuilder();
        if (i == 0) return "0" ;
        valueToDisplay.append(createConcreteStringFromInt(i, 3, "Fizz"));
        valueToDisplay.append(createConcreteStringFromInt(i, 5, "Buzz") );
        return valueToDisplay.toString();
    }

    private static String createConcreteStringFromInt(int number, int divisor, String phraseName) {
        return ((number % divisor ) == 0) ? phraseName: "";
    }
}

