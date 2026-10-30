package array;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter value "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("ALl values are: ");
        for(int n:a)
            System.out.print(n+" ");
    }
}
