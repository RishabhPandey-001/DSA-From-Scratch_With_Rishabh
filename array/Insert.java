package array;
import java.util.*;
public class Insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int[] a={10, 20, 30, 40, 50, 60, 70};
        for(int n:a){
            System.out.print(n+" ");
        }
        System.out.println("\nENter index: ");
        int index=sc.nextInt();
        System.out.println("enter the value: ");
        int val=sc.nextInt();
        int[] b=insertElement(a, index, val);
         for(int n:b){
            System.out.print(n+" ");
        }
    }

    public static int[] insertElement(int[] a, int index, int val) {
        if (index < 0 || index > a.length) {
            System.out.println("Index out of bounds");
            return a;
        }
        int[] b=new int[a.length+1];
        b[index]=val;
        for(int i=0;i<b.length;i++){
            if(i<index)
                b[i]=a[i];
            else if(i>index)
                b[i]=a[i-1];
        }
    return b;   
    }
    
}
