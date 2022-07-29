public class Practice {
    public static void main(String[] args) {
        Practice application = new Practice();

        int[][] arr1 = new int[][]{
                {1, 2}
                , {2, 3}};

        int[][] arr2 = new int[][]{
                {3, 4}
                , {5, 6}};

        int[][] answer = application.solution(arr1, arr2);

        for (int i = 0; i < answer.length; i +=1){
            for(int element:answer[i]){
                System.out.println(element);
            }
        }
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int[][] temp = new int[arr1.length][arr1[1].length];

        for (int i = 0; i < arr1.length; i += 1) { //arr배열의 n번째 배열요소
            for (int j = 0; j < arr1[i].length; j += 1) {    //arr배열의 배열의 n번째 요소
                temp[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        answer = temp;

        return answer;
    }
}