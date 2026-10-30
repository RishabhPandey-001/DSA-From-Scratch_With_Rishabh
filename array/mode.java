// find mode of array 

import java.util.*;

class mode {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mode = arr[0];
        int maxFrequency = 0;
        for (int i = 0; i < arr.length; i++) {

            int frequency = freq.getOrDefault(arr[i], 0) + 1;
            freq.put(arr[i], frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = arr[i];
            }
        }

        System.out.println("Mode = " + mode);
        System.out.println("Frequency = " + maxFrequency);
    }
}
