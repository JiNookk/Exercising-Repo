import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberBaseball3 {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        Integer[] shuffleNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = Arrays.asList(shuffleNumber);
        Collections.shuffle(list);
        list.toArray(shuffleNumber);

        int [] answer = new int[]{shuffleNumber[0], shuffleNumber[1], shuffleNumber[2]};
        int [] guess = new int[3];

        int strike = 0;
        int ball = 0;

        while (strike <3) {
            strike= 0;
            ball = 0;

            boolean isOverlapped = false;
            boolean isOutOfRange = false;

            //입력
            System.out.print("Guess number: ");

            for (int i=0; i<guess.length; i+=1){
                guess[i] = 0;
                guess[i] = scanner.nextInt();
                if (guess[i] < 0 || guess[i] > 9 ){
                    isOutOfRange =true;

                    if (i == guess.length-1){
                        break;
                    }
                }
            }

            if (isOutOfRange == true){
                System.out.println("0~9까지의 숫자를 입력해주세요!");
                continue;
            }

            //처리
            for (int i = 0; i <guess.length; i +=1){
                for (int j = 0; j < guess.length; j += 1){
                    if (guess[i] == guess[j] && i != j){
                        isOverlapped = true;
                    }

                    if (guess[i] == answer[i]){
                        strike += 1;
                        break;
                    }

                    if (guess[i] == answer[j]){
                        ball += 1;
                    }
                }
            }

            //출력
            if (isOverlapped == true){
                System.out.println("각각 다른 숫자를 입력해주세요!");
                continue;
            }

            System.out.println(strike + " Strike");
            System.out.println(ball + " Ball");

            if (strike == 3){
                System.out.println("You win!!");
            }
        }
    }
}
