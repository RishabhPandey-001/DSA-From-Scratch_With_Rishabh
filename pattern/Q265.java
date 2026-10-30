import java.util.Scanner;
class Q265{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n){
		int mid=n/2+1;	int sSpace=n/2;		int eStar=5*n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=mid;j++){//Section-1
				if(j<=sSpace)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			for(int j=mid+1;j<=n+1;j++){//Section-2
				if(i==1 || j==n+1 && i<=mid)
					System.out.print("@ ");
				else
					System.out.print("  ");	
			}
			for(int j=n+2;j<=2*n-1;j++){//Section-3
				if(i>mid)
					System.out.print("* ");
				else
					System.out.print("  ");	
			}
			for(int j=2*n;j<=5*n/2;j++){//Section-4
				if(i==1 || j==2*n && i<=mid)
					System.out.print("@ ");
				else
					System.out.print("  ");	
			}
			for(int j=5*n/2+1;j<=eStar;j++){//Section-5
				System.out.print("* ");	
			}

		if(i<mid){
			sSpace--;	eStar++;
		}else{
			sSpace++;	eStar--;
		}
		System.out.println();
		}
	}
}
