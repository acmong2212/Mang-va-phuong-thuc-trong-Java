import java.util.Arrays;

public class SumDuongCheoChinh {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.floor(Math.random()*10));
            }
        }
        for (int[] c : arr) {
            System.out.println(Arrays.toString(c));
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
