import java.util.Scanner;
class Pattern11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		if(n%2==0){
			System.out.println("Pattern is NOT Possible for Even Rows!!");
			return;
		}
		int mid=n/2+1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==mid || j==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
}
