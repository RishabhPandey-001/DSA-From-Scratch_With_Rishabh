
import java.util.Scanner;

class conditionals {

    public static void main(String[] args) {
        //conditionals  if //   if else // if else ladder 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("this number is divisible both 3 & 5");

        } else if (num % 3 == 0) {
            System.out.println("this number is divisible only 3");

        } else if (num % 5 == 0) {
            System.out.println("this number is devisible only 5");

        } else {
            System.out.println("none");
        }

    }
}
