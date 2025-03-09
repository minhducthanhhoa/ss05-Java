import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int countEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Số lượng phần tử chẵn trong mảng là: " + countEven);
    }
}
