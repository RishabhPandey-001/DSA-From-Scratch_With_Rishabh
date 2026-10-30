
import java.util.Scanner;

public class numberisfactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value ofx");
        int x = sc.nextInt();
        System.out.println("Enter value of y");
        int y = sc.nextInt();
        if (x % y == 0) {
            System.out.println(" y is the factor of x");
        } else {
            System.out.println("y is not the factor of x");
        }
    }

}
