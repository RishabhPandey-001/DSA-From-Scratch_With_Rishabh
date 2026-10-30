// Write a Java program to find the missing number in an array 
// containing n distinct numbers taken from the range 0 to n.
// The array contains exactly one missing number. Return the missing number.

import java.util.*;
class missingnumfromarray{
static int missingnum(int [] nums){
    int xorsum = 0;
    for(int i: nums){
        xorsum = xorsum ^ i;
    }
    for(int i = 0; i<=nums.length; i++){
        xorsum = xorsum ^ i;
    }
    return xorsum;
}
public static void main(String[] args){
 int[] nums = {0,1,3,5};  
 System.out.print(missingnum(nums));



}
}