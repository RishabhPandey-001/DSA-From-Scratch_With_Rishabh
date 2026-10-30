import java.util.Scanner;
class SolidRec{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5 ; j++ ){
                  System.out.print("* ");
            }
             System.out.println();
        }
       
    }
	}
