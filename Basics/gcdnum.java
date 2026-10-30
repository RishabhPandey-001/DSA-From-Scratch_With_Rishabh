import java.util.*;

// class gcdnum {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int number1 = sc.nextInt();

//         System.out.print("Enter the second number: ");
//         int number2 = sc.nextInt();

//         int gcdResult = 1;

//         for (int i = 1; i <= number1 && i <= number2; i++) {

//             if (number1 % i == 0 && number2 % i == 0) {
//                 gcdResult = i;
//             }
//         }

//         System.out.println("GCD of num1 and num2 is: " + gcdResult);
//     }
// }





import java.util.Scanner;

class gcdnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        while (number1 != number2) {

            if (number1 > number2) {
                number1 = number1 - number2;
            }

            if (number2 > number1) {
                number2 = number2 - number1;
            }
        }

        System.out.println("GCD of num1 and num2 is: " + number1);
    }
}