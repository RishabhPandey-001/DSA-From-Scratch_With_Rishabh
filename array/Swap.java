package array;

public class Swap {
    public static void main(String[] args) {
        int[] a={10, 20, 30, 40, 50, 60};
        for(int n:a)
            System.out.print(n+" ");
        swap(a, 2, 4);
        System.out.println("\n===========");
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
