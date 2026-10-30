import java.util.*;

public class frequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int highestFrequency = Integer.MIN_VALUE;
        int lowestFrequency = Integer.MAX_VALUE;

        int highestElement = 0;
        int lowestElement = 0;

        // Find highest and lowest frequency
        for (int element : map.keySet()) {

            int frequency = map.get(element);

            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                highestElement = element;
            }

            if (frequency < lowestFrequency) {
                lowestFrequency = frequency;
                lowestElement = element;
            }
        }

        System.out.println("Highest frequency element: " + highestElement);
        System.out.println("Highest frequency: " + highestFrequency);

        System.out.println("Lowest frequency element: " + lowestElement);
        System.out.println("Lowest frequency: " + lowestFrequency);
    }
}