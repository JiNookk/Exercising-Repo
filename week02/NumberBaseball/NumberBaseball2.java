import java.util.Random;
import java.util.Scanner;

public class NumberBaseball2 {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] suffleAnswer = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = suffleAnswer[x];

            suffleAnswer[x] = suffleAnswer[y];
            suffleAnswer[y] = temp;
        }

        int[] correctAnswer = new int[4];
        for (int i = 0 ; i < correctAnswer.length; i +=1){
            correctAnswer[i] = suffleAnswer[i];
        }

        int[] inputAnswer = new int[correctAnswer.length];

        while (true) {
            int strike = 0;
            int ball = 0;

            //입력
            System.out.println("숫자를 입력해주세요: ");
            inputAnswer[0] = scanner.nextInt();
            inputAnswer[1] = scanner.nextInt();
            inputAnswer[2] = scanner.nextInt();
            inputAnswer[3] = scanner.nextInt();
            System.out.println("");

            //처리
            for (int i = 0; i < inputAnswer.length; i += 1) {
                for (int j = 0; j < inputAnswer.length; j += 1) {
                    if (i != j && inputAnswer[i] == inputAnswer[j]) {
                        System.out.println("각각 다른 숫자를 입력해주세요!");
                        break;
                    }

                    if (inputAnswer[i] == correctAnswer[i]) {
                        strike += 1;
                        break;
                    }
                    if (inputAnswer[i] == correctAnswer[j]) {
                        ball += 1;
                    }
                }
            }

            //출력
            System.out.println(strike + "S " + ball + "B");
        }
    }
}
