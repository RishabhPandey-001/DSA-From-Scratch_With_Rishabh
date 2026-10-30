import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={18, 22, 16, 25, 10, 30, 30, 40, 50,22, 25};
        System.out.println("Before Sorting: "+Arrays.toString(a));
        quickSort(a,0, a.length-1);
         System.out.println("After Sorting: "+Arrays.toString(a));
    }
    public static void quickSort(int[] a, int low, int high){
        if(low<high){
            int pivotIndex=divide(a, low, high);
            quickSort(a, low, pivotIndex-1);
            quickSort(a, pivotIndex+1, high);
        }
    }
    public static int divide(int[] a, int low, int high){
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<=pivot){
                i+=1;
                swap(a, i, j);
            }
        }
        swap(a, i+1, high);
    return i+1;
    }
    public static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
}
