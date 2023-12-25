import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }

        // Tekrar eden sayıları ve tekrar sayılarını ekrana yazdırma.
        for (int k = 0; k < startIndex; k++) {
            int currentNum = duplicate[k];
            int count = 0;

            for (int num : list) {
                if (num == currentNum) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(currentNum + " sayısı " + count + " kez tekrar ediyor.");
            }
        }
    }
}
