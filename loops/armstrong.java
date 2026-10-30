// import java.util.Scanner;

// public class armstrong {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int original = n;
//         int sum = 0;

//         while (n > 0) {
//             int digit = n % 10;
//             sum = sum + digit * digit * digit;
//             n = n / 10;
//         }

//         if (sum == original) {
//             System.out.println("Armstrong Number");
//         } else {
//             System.out.println("Not an Armstrong Number");
//         }
//     }
// }


// ====================================================

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

     
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        
        temp = n;

        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;

           
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;
        }

    
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

       
    }
}