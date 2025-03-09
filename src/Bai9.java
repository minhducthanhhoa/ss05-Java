import java.util.Scanner;
import java.util.Random;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước ma trận (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ma trận không hợp lệ");
        } else {
            int[][] matrix = new int[n][n];
            Random rand = new Random();


            System.out.println("Ma trận ban đầu:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = rand.nextInt(100);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            rotateMatrix90(matrix, n);

            System.out.println("Ma trận sau khi xoay 90 độ:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void rotateMatrix90(int[][] matrix, int n) {
        int[][] temp = new int[n][n];

        // Xoay ma trận
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Sao chép kết quả vào ma trận gốc
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
