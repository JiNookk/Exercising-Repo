import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] shuffleAnswer = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] gameAnswer = new int[3];
        int[] answer = new int[3];

        int strike = 0;
        int ball = 0;

        int x = 0;
        int y = 0;
        int temp = 0;

        for (int i = 0; i<20; i+=1){
            x = random.nextInt(10);
            y = random.nextInt(10);
            temp = shuffleAnswer[x];

            shuffleAnswer[x] = shuffleAnswer[y];
            shuffleAnswer[y] = temp;
//            System.out.println(shuffleAnswer[x] + " " + shuffleAnswer[y]);
        }

        for (int i = 0; i < gameAnswer.length; i +=1){
            gameAnswer[i] = shuffleAnswer[i];
//            System.out.print(gameAnswer[i]);
        }
        System.out.println("");

        while (true) {
            //입력

            strike = 0;
            ball = 0;

            System.out.println("세 개의 숫자를 입력하시오!");
            for (int i = 0; i < 3; i += 1) {
                answer[i] = scanner.nextInt();
                if(answer[i] > 9) {
                    System.out.println("0~9 사이의 수를 입력해주세요!");
                    break;
                }
            }
            System.out.println("");

            //처리
            //TODO : 같은 숫자 입력시 에러코드 뜨게 처리

            for (int i = 0; i < answer.length; i += 1) {
                for (int j = 0; j < answer.length; j += 1) {
                    if (answer[i] == gameAnswer[i]) {
                        strike += 1;
                        System.out.println("strike: " + strike);
                        break;
                    }
                    if (answer[i] == gameAnswer[j]) {
                        ball += 1;
                    }
                }
            }
            //출력
            System.out.println(strike + "S  " + ball + "B");
            System.out.println("");

            if (strike == 3){
                System.out.println("축하합니다. 게임을 클리어하셨습니다!");
                break;
            }
        }
    }
}
