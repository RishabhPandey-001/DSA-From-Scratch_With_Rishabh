import java.util.*;
class LeetCode118{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n=sc.nextInt();
		System.out.println(pascalTriangle(n));
	}
	public static List<List<Integer>> pascalTriangle(int n){
		List<List<Integer>> pascal=new ArrayList<>();
		for(int i=0;i<n;i++){
			pascal.add(printPascalRow(i));
		}
	return pascal;
	}
	public static List<Integer> printPascalRow(int n){
		List<Integer> row=new ArrayList<>();
		int comb=1;
		row.add(comb);
		for(int i=0;i<n;i++){
			comb=comb*(n-i)/(i+1);
			row.add(comb);
		}
	return row;
	}
}
