import java.util.*;
class factorial{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
            
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}


// import java.util.Scanner;

// public class Factorial {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         long factorial = 1;
//         int i = 1;

//         while (i <= n) {
//             factorial = factorial * i;
//             i++;
//         }

//         System.out.println("Factorial = " + factorial);
//     }
// }



// import java.util.*;
// class factorial{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         int factorial = 1;
//         for (int i = 1; i <= num; i++) {
//             factorial = factorial * i;
            
//         }
//         System.out.println("The factorial of " + num + " is: " + factorial);
//     }
// }

