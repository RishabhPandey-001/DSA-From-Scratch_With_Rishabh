package array;
class ZigZagMerge{
    public static void main(String[] args) {
        int[] a={10, 20, 30, 40, 50, 60, 70, 80};
        int[] b={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] res=zigZagMerge(a, b);
        for(int n:res)
            System.out.print(n+" ");

    }

    public static int[] zigZagMerge(int[] a, int[] b){
        int[] c=new int[a.length+b.length];
        int i=0, j=0;
        while(i<a.length && i<b.length){
            c[j++]=a[i];
            c[j++]=b[i];
        i++;
        }
        while(i<a.length)
            c[j++]=a[i++];
        while(i<b.length)
            c[j++]=b[i++];
    return c;
    }
}