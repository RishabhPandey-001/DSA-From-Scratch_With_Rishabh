import java.util.Scanner;

class shortcircuit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num = sc.nextInt();
        if (num % 10 == 0 && num % 5 == 0) {
            System.out.println("divisible by both 5 and 10");
        }
        else{
            System.out.println("No");
        }
        

        
    }
}