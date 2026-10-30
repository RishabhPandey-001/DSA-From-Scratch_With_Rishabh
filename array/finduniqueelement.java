// {1,1,2,3,3,5,4,5,4}
import java.util.*;
class finduniqueelement{
public static int findunique(int [] arr){
int xorsum = 0;
for(int i: arr){
    xorsum = xorsum^i;
}
return xorsum;
}
    public static void main(String [] args){
 int [] nums = {1,1,2,3,3,5,4,5,4};
System.out.println(findunique(nums));
    }
}