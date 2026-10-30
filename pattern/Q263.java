import java.util.Scanner;
class Q263{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		int start=1,	end=n;
		int mid=n/2+1;	
		for(int i=1;i<=n;i++){
			int num=mid;
			for(int j=1;j<=n;j++){
				if(j<start)
					System.out.print(num-- +" ");
				else if(j>=end)
					System.out.print(num++ +" ");
				else
					System.out.print(num +" ");
			}
		if(i<mid){
			start++;	end--;
		}else{
			start--;	end++;
		}
		System.out.println();
		}
	}
}
