// import java.util.Scanner;

// public class gcd {
//     public static void main(String[] args) {// using for loop 

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int gcd = 1;

//         for (int i = 1; i <= Math.min(a, b); i++) {

//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//         }

//         System.out.println("GCD = " + gcd);
//     }
// }


// using while loop

// import java.util.Scanner;

// public class gcd {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }

//         System.out.println("GCD = " + a);
//     }
// }

// using recursion 

// import java.util.Scanner;

// public class gcd {

//     static int gcd(int a, int b) {

//         if (b == 0) {
//             return a;
//         }

//         return gcd(b, a % b);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("GCD = " + gcd(a, b));
//     }
// }

//  Using subtraction — Euclidean Algorithm variant

// import java.util.Scanner;

// public class gcd {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         while (a != b) {

//             if (a > b) {
//                 a = a - b;
//             } else {
//                 b = b - a;
//             }
//         }

//         System.out.println("GCD = " + a);
//     }
// }



//  Checking divisors from the smaller number downward

// import java.util.Scanner;

// public class gcd {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int gcd = 1;

//         for (int i = Math.min(a, b); i >= 1; i--) {

//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//                 break;
//             }
//         }

//         System.out.println("GCD = " + gcd);
//     }
// }



// using Euclidean Algorithm
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD = " + a);
    }
}
