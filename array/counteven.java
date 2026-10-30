import java.util.*;
class counteven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        
        for(int  i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
           count++;
            }
        }
         System.out.println(count);
    }
}