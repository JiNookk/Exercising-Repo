import model.Calculate;
import model.IntegerRepository;

import javax.annotation.processing.AbstractProcessor;

public class SumInteger {
    private int[] absolutes;
    private boolean[] signs;

    public static void main(String[] args){
        SumInteger application = new SumInteger();

        application.run();
    }

    private void run() {
        //준비
        IntegerRepository integerRepository = new IntegerRepository();

//        int[] absolutes = integerRepository.getAbsolutes();
//        boolean[] signs = integerRepository.getSigns();


        //입력
        getArray();

        //처리
        Calculate calculate = new Calculate(absolutes, signs);
        int result = calculate.process();


        //출력
    }

    private void getArray() {
        absolutes = new int[]{4, 7, 12};
        signs = new boolean[]{true, false, true};
    }
}