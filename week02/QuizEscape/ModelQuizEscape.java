//1. 계속해서 문제 내기
//2. 몇 문제 맞췄는지 검사하기

import java.util.Scanner;

public class ModelQuizEscape {
    public static void main(String[] args){
        //준비
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while(count < 3){
            //입력
            System.out.println("Input 2 number: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x +" + "+ y + " = ?");
            int answer = scanner.nextInt();

            //처리
            boolean result = answer == x + y;
            if (result){
                count += 1;
            }

            //출력
            if (result) {
                System.out.println("You're right!");
            }
            if (!result) {
                System.out.println("What?");
            }
        }
    }
}
