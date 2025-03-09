import java.util.Scanner;

public class Bai8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] freq = new int[1001];
        for (int num : arr) {
            freq[num]++;
        }

        int count = 0;
        for (int num : arr) {
            if (freq[num] == 1) {
                arr[count++] = num;
            }
        }

        if (count == 0) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            System.out.println("Mảng sau khi loại bỏ các phần tử trùng lặp: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
