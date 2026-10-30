
import java.lang.*;
import java.util.*;

class practice {

    public static void main(String[] args) {
// Create a menu-driven Java program:
// 1. Check Even/Odd
// 2. Check Positive/Negative
// 3. Find Square
// 4. Find Cube
// 5. Exit

// Use switch to perform the selected operation.
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("==========Menu==========");
        //     System.out.println("1. Even/Odd" );
        //     System.out.println("2.Positive/Negative ");
        //     System.out.println("3. Square");
        //     System.out.println("4. Cube");
        //     int choice = sc.nextInt();
        //     switch (choice) {
        //         case 1:
        //             System.out.println("Enter the number:");
        //             int num = sc.nextInt();
        //             if (num % 2 == 0) {
        //                 System.out.println("Number is even");
        //             } else {
        //                 System.out.println("Number is odd");
        //             }
        //             break;
        //         case 2:
        //             System.out.println("Enter the number:");
        //             int num1 = sc.nextInt();
        //             if (num1 > 0) {
        //                 System.out.println("Number is positive");
        //             } else {
        //                 System.out.println("Number is negative");
        //             }     
        //             break;
        //         case 3:
        //             System.out.println("Enter the number:");
        //             int num2 = sc.nextInt();
        //             System.out.println("square of num is: " + (num2 * num2));
        //             break;
        //         case 4:
        //             System.out.println("Enter the number:");
        //             int num3 = sc.nextInt();
        //             System.out.println("square of num is: " + (num3 * num3 * num3));
        //             break;      
        //         default:
        //              System.out.println("Exit");
        //     }
        // }}
        // System.out.println("Enter two numbers");
        // System.out.print("Enter first Number: ");
        // int x = sc.nextInt();
        // System.out.print("Enter Second Number: ");
        // int y = sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter the Operation: ");
        // String option = sc.nextLine();
        // String Finalopt = option.toUpperCase();
        // switch (Finalopt) {
        //     case "ADD":
        //         System.out.println("Addition of x and y is:" + (x + y));
        //         break;
        //     case "SUB":
        //         System.out.println("Subtraction of x and y is:" + (x - y));
        //         break;
        //     case "MUL":
        //         System.out.println("Mul of x and y is:" + (x * y));
        //         break;
        //     case "DIV":
        //         System.out.println("div of x and y is:" + (x / y));
        //         break;            
        //     default:
        //         System.out.println("Enter the valid operation");
        // }
        // System.out.println("Menu");
        // System.out.println("============================");
        // System.out.println("ADD");
        // System.out.println("SUB");
        // System.out.println("MUL");
        // System.out.println("DIV");
        // System.out.println("Enter two numbers: ");
        // System.out.print("first number:");
        // int x = sc.nextInt();
        // System.out.print("second number:");
        // int y = sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter the Operation: ");
        // String option = sc.nextLine();
        // option.toUpperCase();
        // switch (option) {
        //     case "ADD":
        //         System.out.println("Sum  of x and y is: " + (x+y));
        //         break;
        //         case "SUB":
        //         System.out.println("SUB of x and y is: " + (x-y));
        //         break;
        //         case "MUL":
        //         System.out.println("Multiplication of x and y is: " + (x*y));
        //         break;
        //         case "DIV":
        //         System.out.println("Division of x and y is: " + (x/y));
        //         break;
        //     default:
        //         System.out.println("Invalid Option");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num = sc.nextInt();
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int c = num % 10;
        num = num % 10;
        int d = num % 10;
        num = num / 10;

        if (a + b == c + d) {
            System.out.println("lucky num");
        } else {
            System.out.println("not lucky number");
        }

    }
}
