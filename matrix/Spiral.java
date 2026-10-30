package matrix;
public class Spiral {
    public static void main(String[] args) {
        int n=6;
        generateSpiralPattern(n);
    }
    public static void generateSpiralPattern(int n) {
        int[][] matrix=new int[n][n];
        int left=0,     right=matrix[0].length-1;
        int top=0,      bottom=matrix.length-1;
        int num=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                matrix[top][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                   matrix[i][left]=num++;
                }
                left++;
            }
        }
        printMatrix(matrix);
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
