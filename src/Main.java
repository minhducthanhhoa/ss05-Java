import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[100];

        int currentIndex = 0;
        System.out.println("Nhập vào số phần tử của mảng : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println("Nhap vao phan tu thu :" + i);
            numbers[currentIndex] = scanner.nextInt();
            System.out.println();
            currentIndex++;
        }
        for(int i = 0; i < currentIndex; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}