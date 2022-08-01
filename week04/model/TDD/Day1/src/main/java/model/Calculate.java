package model;

public class Calculate {


    private final int[] absolutes;
    private final boolean[] signs;

    public Calculate(int[] absolutes, boolean[] signs) {
        this.absolutes = absolutes;
        this.signs = signs;
    }

    public int process() {
        int sum = 0;

        for (int i = 0 ; i < signs.length; i += 1){
            if (signs[i] == false){
                absolutes[i] *= -1;
            }
        }

        for (int absolute : absolutes){
            sum += absolute;
        }

        return sum;
    }
}
