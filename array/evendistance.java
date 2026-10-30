
import java.util.*;


public class evendistance { //shortest even disctance 
    public static int findShortestDistance(int[] arr) {
        if (arr == null) {
            return -1;
        }

        // Store indices of all positive even integers
        List<Integer> evenIndices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                evenIndices.add(i);
            }
        }

        // Return -1 if there are fewer than two positive even integers
        if (evenIndices.size() < 2) {
            return -1;
        }

        // Find the minimum difference between adjacent indices
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < evenIndices.size() - 1; i++) {
            int distance = evenIndices.get(i + 1) - evenIndices.get(i);
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        // Test case 1: Multiple positive evens
        int[] arr1 = {1, 4, 3, 7, 8, 10, 2}; 
        // Positive evens are at indices: 1 (val 4), 4 (val 8), 5 (val 10), 6 (val 2)
        // Distances: 4-1=3, 5-4=1, 6-5=1. Shortest is 1.
        System.out.println("Shortest distance: " + findShortestDistance(arr1)); // Output: 1

        // Test case 2: Less than two positive evens
        int[] arr2 = {1, 3, -2, 5, 4, -6}; 
        // Only one positive even is present (4). -2 and -6 are negative.
        System.out.println("Shortest distance: " + findShortestDistance(arr2)); // Output: -1
    }
}