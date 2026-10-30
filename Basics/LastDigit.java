// first and last digit of number 
// import java.util.Scanner;

// public class LastDigit {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int number = sc.nextInt();
//         int lastdigit = number % 10;
//         int firstdigit = (int) (number / Math.pow(10, (int) Math.floor(Math.log10(number))));
//         System.out.println("the first digit is: " + firstdigit);
//         System.out.println("the last digit is: " + lastdigit);
//     }
// }
// sum of digit 
import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number: "); //321
        int number = sc.nextInt(); // 321 
        int lastdigit = number % 10;  // 1
        sum = sum + lastdigit;  // 0 +1
        number = number / 10; // 32
        lastdigit = number % 10;   //2
        sum = sum + lastdigit;   // 0+1+2
        number = number / 10; //3
        lastdigit = number % 10;  //3  
        sum = sum + lastdigit;  // 3+3
        number = number / 10;  // 0
        System.out.println("the sum of  digits  is: " + sum);  //6

    }
}
