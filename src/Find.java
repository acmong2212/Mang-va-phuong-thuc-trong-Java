import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        //Khai báo mảng chứa danh sách sinh viên
        String[] students = {"Christian", "Micheal", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        //Khai báo biến lưu tên tìm kiếm và gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student:");
        String input_name = scanner.nextLine();

        // Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
