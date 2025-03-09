public class Bai6 {
    public static void main(String[] args) {
        int[] originalArray = {100, 200, 300, 100, 500, 600, 100, 700, 800, 200,
                300, 400, 500, 600, 700, 100, 200, 300, 100, 500};

        int[] markingArray = new int[1001];

        for (int num : originalArray) {
            markingArray[num]++;
        }

        int maxCount = 0;
        for (int count : markingArray) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất và số lần xuất hiện:");
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxCount) {
                System.out.println("Giá trị: " + i + " - Xuất hiện: " + maxCount + " lần");
            }
        }
    }
}
