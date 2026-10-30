// import java.util.*;
package array;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 20, 40, 50, 10};

        a = removeDuplicates(a);

        for (int n : a) {
            System.out.print(n + " ");
        }
    }

    public static int[] removeDuplicates(int[] a) {

        int n = a.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j]) {

                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }

                    n--;
                    j--;
                }
            }
        }

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        return b;
    }
}