public class reversenum{
    public static void main(String[] args) {
        int n = 57834;
        int reverse = 0;
        while (n != 0) { 
            int digit  = n %10;
            reverse =  (reverse*10) + digit;
            n = n/10;
            
        }
        System.out.println(reverse);


    }

}





// import java.util.Scanner;

// public class ReverseNumber {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int reverse = 0;

//         for (; n != 0; n = n / 10) {

//             int digit = n % 10;

//             reverse = reverse * 10 + digit;
//         }

//         System.out.println("Reverse = " + reverse);
//     }
// }


//using do while ...........
// import java.util.Scanner;

// public class ReverseNumber {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int reverse = 0;

//         do {

//             int digit = n % 10;

//             reverse = reverse * 10 + digit;

//             n = n / 10;

//         } while (n != 0);

//         System.out.println("Reverse = " + reverse);
//     }
// }
