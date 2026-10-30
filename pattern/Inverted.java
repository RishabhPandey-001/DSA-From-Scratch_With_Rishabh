import java.util.Scanner;
class Inverted{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <= row; col++){
             System.out.print("* ");
            }
            System.out.println();
        }
       
    }
    
	}