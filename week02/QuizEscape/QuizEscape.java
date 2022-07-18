import java.util.Random;
import java.util.Scanner;

public class QuizEscape {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int goalAnswer = 10;

        int correctCount = 0;
        while (correctCount < 10) {
            // 입력
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);

            System.out.println(number1 + " + " + number2 + " = ? ");
            int answer = scanner.nextInt();

            boolean isCorrect = answer == (number1 + number2);
            boolean isIncorrect = answer != (number1 + number2);

            // 처리
            if (isIncorrect) {
                System.out.println("틀렸습니다! " + (goalAnswer - correctCount) + "문제를 더 맞혀야 집에 갈 수 있습니다!");
            }

            if (isCorrect) {
                correctCount += 1;
                if (correctCount == 10){
                    System.out.println("축하합니다! 집에 가실 수 있습니다 짝짝짝");
                    continue;
                }
                System.out.println("축하합니다! " + (goalAnswer - correctCount) + "문제만 더 맞히면 집에 갈 수 있습니다!");
            }
            // 출력
        }
    }
}
