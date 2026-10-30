import java.util.Scanner;
class PascalTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		pascalTriangle(n);
	}
	public static void pascalTriangle(int n){
		int space=n-1;
		for(int i=0;i<n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");
			printPascalRow(i);
		space--;
		System.out.println();
		}

	}
	public static void printPascalRow(int n){
		int comb=1;
		System.out.printf("%-6d", comb);
		for(int i=0;i<n;i++){
			comb=comb*(n-i)/(i+1);
			System.out.printf("%-6d", comb);
		}
	}
}
