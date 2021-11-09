import java.util.Arrays;
import java.util.Scanner;

public class FindValueMin {
    public static void main(String[] args) {
        int[] array;
        int size;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        size = input.nextInt();
        array = new int[size];

        int i = 0;
        while (size > i) {
            System.out.println("nhap gia tri phan tu");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min < array[j]){
                array[j] = min;
            }
        }
        System.out.println("Gia tri nho nhat trong mang la`: " + min);
    }
}
