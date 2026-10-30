import java.util.*;

public class insertionsort {
    public static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
                // System.out.println("runs");
            }
            
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        insertionSort(data);
        System.out.println("Sorted: " + Arrays.toString(data));
    }
}