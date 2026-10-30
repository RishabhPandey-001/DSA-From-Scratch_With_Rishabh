import java.util.*;
class Prefixsum{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int arr[] = {5,3,3,-1,-5,6,8,0};
for(int i = 1; i < arr.length; i++){
arr[i] += arr[i-1];

}
int count = 0;
HashMap<Integer, Integer> map = new HashMap<>();
map.put(0,1);
for(int x: arr){
count += map.getOrDefault(x, 0);
map.put(x, 1+map.getOrDefault(x,0));

}
System.out.println(count);
}
}

