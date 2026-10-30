import java.util.Scanner;
class Q237{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		int num=n*n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2==1)
					System.out.printf("%-4d", num--);
				else
					System.out.printf("%-4d", num++);
			}
		if(i%2==1)
			num-=(n-1);
		else
			num-=(n+1);
		System.out.println();
		}
	}
}
