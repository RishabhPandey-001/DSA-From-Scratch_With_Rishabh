import java.util.*;

public class primenum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not a prime number");
        } 
        else {

            boolean isPrime = true;

            for (int i = 2; i <= n ; i++) {  //Math.sqrt(n)

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } 
            else {
                System.out.println("Not a prime number");
            }
        }

        sc.close();
    }
}




// import java.util.Scanner;

// public class PrimeNumber {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int count = 0;

//         for (int i = 1; i <= n; i++) {

//             if (n % i == 0) {
//                 count++;
//             }
//         }

//         if (count == 2) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not a Prime Number");
//         }
//     }
// }



// import java.util.Scanner;

// public class PrimeNumber {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int count = 0;

//         for (int i = 1; i <= n / 2; i++) {

//             if (n % i == 0) {
//                 count++;
//             }
//         }

//         if (n > 1 && count == 1) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not a Prime Number");
//         }
//     }
// }



