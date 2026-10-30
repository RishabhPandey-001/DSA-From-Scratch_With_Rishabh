package matrix;

public class ReverseByRows {
    public static void main(String[] args) {

        int[][] a={ {2, 14, 18, 8},
                    {10, 12, 14, 16},
                    {24, 22, 20, 18},
                    {26, 28, 30, 32}

        };
        printMatrix(a);
       reverseMatrixByRows(a);
        System.out.println("After Reversing===========");
        printMatrix(a);
    }
    public static void reverseMatrixByRows(int[][] a){
        for(int i=0;i<a.length;i++)
            reverse(a[i]);
    }
    public static void reverse(int[] a){
        int start=0, end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start+=1;   end-=1;
        }
    }
    
   
    public static void printMatrix(int[][] a){
        int rows=a.length;
        int cols=a[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(a[i][j]+"\t");
        System.out.println();
        }
        System.out.println();
    }
    
}
