// Write   a java  program to find out the shortest distance between two even positive 
//integers in an array arr and print the distance. If there is one or zero even
//positive integer in the array then return -1.



import java.util.*;

public class shortestdistance {

    public static int shortestDistance(int[] arr) {

        int previous = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Check whether the number is even and positive
            if (arr[i] > 0 && arr[i] % 2 == 0) {

                // If this is not the first even positive number
                if (previous != -1) {

                    int distance = i - previous;

                    minDistance = Math.min(minDistance, distance);
                }

                // Store current index
                previous = i;
            }
        }

        // If fewer than two even positive integers were found
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }

        return minDistance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(shortestDistance(arr));

        sc.close();
    }
}

