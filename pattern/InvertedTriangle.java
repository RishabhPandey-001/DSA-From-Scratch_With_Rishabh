import java.util.*;

class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int n = sc.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int row = 0; row < n; row++) {

            // Print spaces
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 0; col < (2 * (n - row) - 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}