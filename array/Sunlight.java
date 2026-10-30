package array;

public class Sunlight {
    public static void main(String[] args) {
        int[] a={15, 20, 30, 40, 35, 60, 50, 20};
        int count=sunlight(a);
        System.out.println(count);
    }
    public static int sunlight(int[] a){
        int max=0;  int count=0;
        for(int n:a){
            if(n>max){
                max=n;
                count++;
            }
        }
        return count;
    }
    
}
