import java.util.Scanner;
class Q208{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		if(n%2==0){
			System.out.println("Pattern is NOT Possible");
		return;
		}
		int mid=n/2+1;	int left=1,	right=n;
		int num=n*n/2+n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			if(j<=left || j>=right)
				System.out.printf("%-4d", num--);
			else
				System.out.print("    ");		
			}
			
		if(i<mid){
			left++;		right--;
		}else{
			left--;		right++;
		}
		System.out.println();
		}
	}
}
