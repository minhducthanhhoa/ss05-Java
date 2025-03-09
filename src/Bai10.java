import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không hợp lệ");
        } else {
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxSum = arr[0];
            int currentSum = arr[0];

            for (int i = 1; i < n; i++) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println("Tổng lớn nhất của dãy con liên tiếp: " + maxSum);
        }
    }
}
