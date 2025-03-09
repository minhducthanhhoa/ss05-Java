import java.sql.SQLOutput;
import java.util.Scanner;

public class Mang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        int n = scanner.nextInt();

        System.out.println("Nhập vào số cột của mảng: ");
        int m = scanner.nextInt();

        int[][] numbers = new int[n][m];

        do {
            System.out.println("******************MENU*******************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. Hiển thị giá trị các phần tử");
            System.out.println("3. Kiểm tra sự tồn tại của 1 giá trị");
            System.out.println("4. Thoát");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("numbers[%d][%d]=", i, j);
                            numbers[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("%3d", numbers[i][j]);
                        }
                    }
                    break;
                    case 3:
                    System.out.println("Nhập vào 1 giá trị cần tìm");
                    int searchValue = scanner.nextInt();
                    boolean isExist = false;
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            if (numbers[i][j] == searchValue) {
                                System.out.printf("Bingo!!!");
                                isExist = true;
                                break;
                            }
                        }
                    }
                    if (!isExist) {
                        System.out.printf("Không tồn tại giá trị %d trong mảng", searchValue);
                    }
            }
        } while (true);
    }
}
