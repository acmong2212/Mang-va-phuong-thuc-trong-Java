import java.util.Scanner;

public class GTLN {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 5) {
                System.out.println("Size should not exceed 5");
            }
        } while (size > 5);

        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        for (int j = 0; j < array.length; j++) {
            System.out.println("Enter element" + (j + 1) + " : ");
            array[j] = scanner.nextInt();
        }

        //Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
