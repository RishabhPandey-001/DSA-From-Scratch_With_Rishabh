
import java.util.Scanner;

public class sumdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sumofdigits = 0;
        while (n != 0) { 
            int digit  = n %10;
            sumofdigits += digit;
            n = n/10;
            
        }
        System.out.println(sumofdigits);


        // int sum = 0;
        // n = n%10;
        // sum = sum + n;
        // n = n /10;


    }

}