
import java.util.Scanner;

public class celToFaren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value celsius: ");
        Float cel = sc.nextFloat();
        Float faren = (cel * 9 / 5) + 32;
        System.out.println("celsius conversion to farenhite is: " + faren);

    }
}
