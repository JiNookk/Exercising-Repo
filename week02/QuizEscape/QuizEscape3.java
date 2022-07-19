import java.util.Scanner;

public class QuizEscape3 {
    public static void main(String[] args){
        //준비
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while (correctCount < 3){
            //입력
            System.out.println("Input 2 numbers: ");

            int addElement1 = scanner.nextInt();
            int addElement2 = scanner.nextInt();

            System.out.println(addElement1 + " + " + addElement2 + " = ? ");

            //처리
            int addResult = scanner.nextInt();

            boolean sameResult = addResult == addElement1 + addElement2;
            boolean diffResult = addResult != addElement1 + addElement2;

            //출력
            if (sameResult){
                correctCount +=1 ;
                System.out.println("You're right! (" + correctCount + ")");
            }

            if (diffResult){
                System.out.println("What?");

            }

            if (correctCount == 3){
                System.out.println("Escape!");
            }
        }
    }
}
