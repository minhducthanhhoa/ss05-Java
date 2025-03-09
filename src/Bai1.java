import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 9, 12, 5, 8};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
