import java.util.Scanner;

public class Bai5 {
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

        Integer maxOdd = null;
        Integer minOdd = null;

        for (int num : numbers) {
            if (num > 0 && num % 2 != 0) {
                if (maxOdd == null || num > maxOdd) {
                    maxOdd = num;
                }
                if (minOdd == null || num < minOdd) {
                    minOdd = num;
                }
            }
        }

        if (maxOdd == null || minOdd == null) {
            System.out.println("Không có phần tử lẻ nguyên dương trong mảng");
        } else {
            System.out.println("Phần tử lẻ nguyên dương lớn nhất: " + maxOdd);
            System.out.println("Phần tử lẻ nguyên dương nhỏ nhất: " + minOdd);
        }
    }
}
