import java.util.*;
public class palidrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;
        while (n != 0) { 
            int digit  = n %10;
            reverse =  (reverse*10) + digit;
            n = n/10;
            
        }
        if (reverse == temp) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }


    }

}