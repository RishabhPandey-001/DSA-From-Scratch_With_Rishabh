
import java.util.Scanner;

class Armstrong {

    public static void main(String[] args) {

        // An Armstrong number (also called a Narcissistic number)
        // is a number where the sum of each digit raised to the
        // power of the total number of digits is equal to the original number.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        int digits = 0;
        int original = num;
        int temp = num;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate the Armstrong sum
        temp = original;

        while (temp > 0) {
            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, digits);

            temp = temp / 10;
        }

        // Check whether it is an Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
