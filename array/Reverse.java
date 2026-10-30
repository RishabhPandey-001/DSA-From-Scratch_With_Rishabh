package array;

public class Reverse {
    public static void main(String[] args) {
        int[] a={10, 20, 30, 40, 50, 60};
        for(int n:a)
            System.out.print(n+" ");
        reverse(a);
        System.out.println("\n===========");    
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void reverse(int[] a){
        int start=0, end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
