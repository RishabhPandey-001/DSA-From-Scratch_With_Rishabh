package matrix;

public class Transpose {
    public static void main(String[] args) {
        int[][] a={ {2, 4, 6, 8},
                    {10, 12, 14, 16},
                    {24, 22, 20, 18}
                 };
        printMatrix(a);
        int[][] result=transpose(a);
        printMatrix(result);
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
