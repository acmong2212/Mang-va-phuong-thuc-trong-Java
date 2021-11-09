import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int c :arr1) {
            arr3[i] = c;
            i++;
        }
        for (int c :arr2) {
            arr3[i] = c;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
