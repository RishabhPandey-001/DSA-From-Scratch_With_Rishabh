
import java.util.*;

public class NumberRotationByK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int temp = n;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // If K is greater than number of digits
        k = k % digits;

        // Find divisor
        int divisor = 1;
        for (int i = 1; i <= k; i++) {
            divisor *= 10;
        }

        int power = 1;
        for (int i = 1; i <= digits - k; i++) {
            power *= 10;
        }

        int lastPart = n % divisor;
        int firstPart = n / divisor;

        int rotated = lastPart * power + firstPart;

        System.out.println("Rotated number: " + rotated);
    }
}