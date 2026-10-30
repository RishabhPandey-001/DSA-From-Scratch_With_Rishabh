package matrix;

public class MultiplyMatrix {
    public static void main(String[] args) {

        int[][] a={ {2, 4, 5},
                    {3, 4, 6},
        };
        int[][] b={ {12, 5},
                    {6, 4},
                    {3, 2},
        };
        int[][] product=multiply(a, b);
        System.out.println("After Reversing===========");
        printMatrix(product);
    }

    public static int[][] multiply(int[][] a, int[][] b){
        if(a[0].length!=b.length)
            throw new IllegalArgumentException("Number of columns in A must be equal to number of rows in B");
        
        int m=a.length;
        int n=a[0].length;
        int p=b[0].length;
        int[][] result=new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                result[i][j]=0;
                for(int k=0;k<n;k++)
                    result[i][j]=result[i][j]+a[i][k]*b[k][j];
            }
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
