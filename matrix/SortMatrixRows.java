package matrix;

public class SortMatrixRows {
    public static void main(String[] args) {
        int[][] a={ {2, 14, 18, 8},
                    {10, 12, 14, 16},
                    {24, 22, 20, 18}
        };
        printMatrix(a);
        sortMatrixByRows(a);
        System.out.println("After Sorting===========");
        printMatrix(a);
    }
    
    public static void sortMatrixByRows(int[][] a){
        int rows=a.length;
        for(int i=0;i<rows;i++)
            sortRows(a[i]);
    }


    public static void sortRows(int[] a){
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
