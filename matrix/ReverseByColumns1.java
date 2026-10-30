package matrix;

public class ReverseByColumns1 {
    public static void main(String[] args) {

        int[][] a={ {2, 14, 18, 8},
                    {10, 12, 14, 16},
                    {24, 22, 20, 18},
                    {26, 28, 30, 32}

        };
        printMatrix(a);
        reverseMatrixByColumns(a);
        System.out.println("After Reversing===========");
        printMatrix(a);
    }
    public static void reverseMatrixByColumns(int[][] a){
        int cols=a[0].length;
        for(int i=0;i<cols;i++){
            int top=0,  bottom=a.length-1;
            while(top<bottom){
                int temp=a[top][i];
                a[top][i]=a[bottom][i];
                a[bottom][i]=temp;
            top+=1;     bottom-=1;
            }
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
