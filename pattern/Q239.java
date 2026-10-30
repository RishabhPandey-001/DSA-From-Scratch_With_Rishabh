import java.util.Scanner;
class Q239{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j%2==1)
					System.out.printf("%-4d", n*n-n*(j-1)-(i-1));
				else
					System.out.printf("%-4d", n*n-n*(j-1)-(n-i));
			}
		System.out.println();
		}
	}
}
