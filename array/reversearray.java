import java.util.*;
class reversearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int x: arr){
        System.out.print( x +" ");
        }
    }
}