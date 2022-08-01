import java.util.Scanner;

public class Calculator {

    private Scanner scanner;

    public static void main(String[] args) {
        Calculator application = new Calculator();

        application.run();
    }

    public void run() {
        //준비
        scanner = new Scanner(System.in);

        //입력
        System.out.println("Input expression: ");

        String expression = scanner.nextLine();

        //처리

        int result = compute(expression);

        //출력

        System.out.println("Result: " + result);
    }

    public int compute(String expression) {
        String[] words = expression.split(" ");

        int x = Integer.parseInt(words[0]);

        String operator = words[1];

        int y = Integer.parseInt(words[2]);


        return switch (operator) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };
       }
}
