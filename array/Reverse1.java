package array;

public class Reverse1 {
    public static void main(String[] args) {
        int[] a={10, 20, 30, 40, 50, 60};
        for(int n:a)
            System.out.print(n+" ");
        reverse(a, 2, 4);
        System.out.println("\n===========");    
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
