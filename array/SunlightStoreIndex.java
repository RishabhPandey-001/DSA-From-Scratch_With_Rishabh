package array;
import java.util.*;
public class SunlightStoreIndex {
    public static void main(String[] args) {
        int[] a={15, 20, 30, 40, 35, 60, 50, 20};
        List<Integer> res=sunlight(a);
        System.out.println(res);
    }
    public static List<Integer> sunlight(int[] a){
        List<Integer> l=new ArrayList<>();
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                l.add(i);
            }
        }
        return l;
    }
}
