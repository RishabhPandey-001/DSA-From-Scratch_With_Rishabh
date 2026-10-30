package matrix;

public class Program2 {
    public static void main(String[] args) {
        int[][] a={ {2, 4, 6, 8},
                    {10, 12, 14, 16},
                    {24, 22, 20, 18}
        };
        printElements(a);

    }
    public static void printElements(int[][] a){
        int rows=a.length;
        int cols=a[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(a[i][j]+"\t");
        System.out.println();
        }
    }
    
}
