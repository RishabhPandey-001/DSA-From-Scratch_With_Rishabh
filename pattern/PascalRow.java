import java.util.Scanner;
class PascalRow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPascalRow(n);
	}

	public static void printPascalRow(int n){
		int comb=1;
		System.out.print(comb+" ");
		for(int i=0;i<n;i++){
			comb=comb*(n-i)/(i+1);
			System.out.print(comb+" ");
		}
	}
}
