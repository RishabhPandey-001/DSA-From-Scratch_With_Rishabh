
import java.util.*;
// find radix of a number given in a string 

class radix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num = sc.nextLine();

        if (num.matches("[01]+")) {  
            System.out.println("Binary radix = 2");

        } else if (num.matches("[0-7]+")) {   
            System.out.println("octal radix = 8");

        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal radix= 10");

        } else if (num.matches("[0-16]+")) {
            System.out.println("Hexadecimal radix = 16");

        } else {
            System.out.println("this is not a number");
        }
    }


    

}
