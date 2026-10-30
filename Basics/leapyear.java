import java.util.*;
class leapyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
       if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
        System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap yr");
        }
    }
}