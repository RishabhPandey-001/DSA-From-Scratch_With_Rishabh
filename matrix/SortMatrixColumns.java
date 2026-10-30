package matrix;

public class SortMatrixColumns {
    public static void main(String[] args) {

        int[][] a={ {2, 14, 18, 8},
                    {10, 12, 14, 16},
                    {24, 22, 20, 18},
                    {26, 28, 30, 32}

        };
        printMatrix(a);
       int[][] b=sortMatrixByColumns(a);
        System.out.println("After Sorting===========");
        printMatrix(b);
    }
    
    public static int[][] sortMatrixByColumns(int[][] a){
        a=transpose(a);
        for(int i=0;i<a.length;i++)
           sortRows(a[i]);
        
        a=transpose(a);
    return a;
    }
     public static int[][] transpose(int[][] a){
        int rows=a.length;
        int cols=a[0].length;
        int[][] result=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                result[j][i]=a[i][j];
        }
        return result;
    }

    public static int[] sortRows(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int pivot=a[i];
            int j=i-1;
            while(j>=0 && a[j]>pivot){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=pivot;
        }
        return a;
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
