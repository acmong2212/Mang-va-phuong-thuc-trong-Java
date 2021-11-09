import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        int[] newArray = new int[Array.length + 1];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can them:");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            newArray[i] = Array[i];
        }

        for (int i = x; i < Array.length + 1; i++) {
            newArray[i] = Array[i - 1];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
