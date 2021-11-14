import java.util.Arrays;
import java.util.Scanner;

public class SumCot {
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

        System.out.println("Nhap cot ma` ban muon tinh tong: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (a == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tong cua cot " + a + " la`: " + sum);
    }
}
