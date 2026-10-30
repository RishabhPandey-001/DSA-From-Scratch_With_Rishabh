import java.util.*;
class firstrepeatingelement{
public static int firstrepeat(int[] arr){
     HashMap<Integer, Integer> freq = new HashMap<>();
     for(int i: arr){
         freq.put(i, freq.getOrDefault(i, 0)+1);
     }
     for(int i: arr){
        if(freq.get(i)>1){
            return i;
        }
     }
     return -1;
}
public static void main(String[] args) {
    int[] nums = {1,1,2,4,5,2,3,5};
    int z = firstrepeat(nums);
    System.out.println(z);
}
}
