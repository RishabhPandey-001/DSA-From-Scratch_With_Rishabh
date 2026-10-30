
import java.util.*;



class twosum {  //by two sum 

    static int[] twosumtarget(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] ans = {arr[i], arr[j]}; //  {i,j}  if asking for index  
                    return ans;
                }
            }
        }
        int[] ans ={};  /// create an empty array just for return statement , in this question compiler will reach this line 
        return ans;
    }

    public static void main(String[] args) {
      int[] arr = {1,5,3,4,6,7};
      int [] ans = twosumtarget(arr, 10);
      System.out.println(Arrays.toString(ans));
    //   for (int i = 0; i < ans.length ; i++) {
    //       System.out.print(ans[i] + " ");
    //   }
    }
}







