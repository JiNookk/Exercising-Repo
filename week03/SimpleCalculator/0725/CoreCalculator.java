public class CoreCalculator {

    private long currentNumber = 0;
    private long accumulator = 0;
    private String currentOperator = "";
    public static final String[] OPERATORS = new String[]{"+", "-", "/", "*", "="};

    public void currentNumber(int number) {
        currentNumber *= 10;
        currentNumber += number;
    }

    public void calculate(String operator) {
        switch (currentOperator) {
            case "" -> accumulator = currentNumber;
            case "+" -> accumulator += currentNumber;
            case "-" -> accumulator -= currentNumber;
            case "*" -> accumulator *= currentNumber;
            case "/" -> accumulator /= currentNumber;
            case "reset" -> accumulator = 0;
        }


        updateOperator(operator);
        currentNumber = 0;
    }

    public void updateOperator(String operator) {
        currentOperator = operator;
    }

    public long getCurrentNumber() {
        return currentNumber;
    }

    public long getAccumulator() {
        return accumulator;
    }
}
