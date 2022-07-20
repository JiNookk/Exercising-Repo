// 요구조건 : 2단 ~ 9단(mvp), 3단씩 출력되게
public class ModelGugudan {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i += 3) {
            for (int j = 1; j < 10; j += 1) {
                System.out.print(i + " * " + j + " = " + i * j);

                System.out.print("\t");

                System.out.print((i+1) + " * " + j + " = " + (i+1) * j);

                System.out.print("\t");

                if (i + 2 == 10){
                    System.out.println();
                    continue;
                }

                System.out.print((i+2) + " * " + j + " = " + (i+2) * j);

                System.out.println();
            }
            if (i+2 == 10){
                break;
            }

            System.out.println();
            System.out.println();
        }
    }
}
