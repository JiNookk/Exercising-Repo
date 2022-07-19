import java.util.Random;
import java.util.Scanner;

public class QuizEscape2 {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int addElement1 = 0;
        int addElement2 = 0;

        int answerLeft = 10;

        while (true) {
            //입력

            addElement1 = random.nextInt(10);
            addElement2 = random.nextInt(10);

            System.out.println(addElement1 + " + " + addElement2 + " = ?");

            int addInput1 = scanner.nextInt();

            boolean addTrue = (addInput1) == (addElement1 + addElement2);
            boolean addFalse = (addInput1) != (addElement1 + addElement2);

            //처리
            if (addTrue) {
                answerLeft -= 1;

                if (answerLeft == 0) {
                    System.out.println("축하합니다! 집에 가시죠");
                    break;
                }
                System.out.println("축하합니다! " + answerLeft + "문제만 더 맞히면 집에 갈 수 있습니다!");
            }

            if (addFalse) {
                System.out.println("틀렸습니다! " + answerLeft + "문제만 더 맞히면 집에 갈 수 있습니다!");
            }
            //출력
        }
    }
}
