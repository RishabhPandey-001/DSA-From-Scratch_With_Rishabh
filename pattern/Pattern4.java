import java.util.Scanner;
class Pattern4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		for(int i=1;i<=n-2;i++){
			for(int j=1;j<=n+2;j++)
				System.out.print("* ");
		System.out.println();
		}
	}
}
