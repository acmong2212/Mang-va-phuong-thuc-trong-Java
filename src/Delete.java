import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        int[] newArray = new int[Array.length - 1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa:");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            newArray[i] = Array[i];
        }

        for (int i = x; i < Array.length - 1; i++) {
            newArray[i] = Array[i + 1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
