import java.util.Scanner;
  class practice{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("reserve of number: ");
        int num = sc.nextInt();
        
        int reverse = 0;
       
      while(num != 0 ){
        int digit = num%10;
        reverse = reverse * 10 + digit;
        num = num / 10;
      }
   System.out.println("reserve num is: "+ reverse );


    }
  }
  