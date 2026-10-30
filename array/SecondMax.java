package array;

public class SecondMax {
    public static void main(String[] args) {
        int[] a={150, 20, 30, 40, 150, 60, 70, 80};
        int secondMax=secondMax(a);
        System.out.println("Second Max: "+secondMax);
    }

    public static int secondMax(int[] a){
        long max=a[0], secondMax=Long.MIN_VALUE;
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            else if(a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
        }
        return (int)secondMax;
    }
}



// class Main {
//     public static void main(String[] args) {
//         int max, smax;
//         max = 0;
//         smax = 0;
//         int []A = {1,2,4,5,6,89,68};
//         for(int i = 0; i< A.length; i++){
//             if(A[i] > max){
//                 smax = max;
//                 max = A[i];
//             }
//             else if(A[i] > smax){
//                 smax = A[i];
//             }
//         }
//         System.out.println(smax);
//     }
// }