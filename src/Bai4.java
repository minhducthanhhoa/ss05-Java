import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Kích thước rỗng");
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Mảng ban đầu: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < size / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }

        System.out.print("Mảng sau khi đảo ngược: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
