import  java.util.*;
class  MenubasedCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("===============");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("MOD");

        System.out.println("Enter two numbers: ");
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Operation: ");
        String option = sc.nextLine();
        option.toUpperCase();
        switch (option) {
            case "ADD":
                System.out.println("Sum  of x and y is: " + (x+y));
                break;
                case "SUB":
                System.out.println("SUB of x and y is: " + (x-y));
                break;
                case "MUL":
                System.out.println("Multiplication of x and y is: " + (x*y));
                break;
                case "DIV":
                System.out.println("Division of x and y is: " + (x/y));
                break;
                case "MOD":
                System.out.println("MOD of x and y  is: " + (x%y));
                break;
            default:
                System.out.println("Invalid Option");
        }

    }
}
