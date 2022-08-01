import java.util.Scanner;

public class CalculatorFetch {
    public static void main(String[] args){
        CalculatorFetch application = new CalculatorFetch();

        application.run();
    }

    private void run() {
        //준비
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("input expression: ");

        String expression = scanner.nextLine();

        //처리
        int result = compute(expression);

        //출력
        System.out.println(result);
    }

    public int compute(String expression) {
        String [] words = expression.split(" ");

        int x = Integer.parseInt(words[0]);

        int y = Integer.parseInt(words[2]);

        return x + y;
    }
}
