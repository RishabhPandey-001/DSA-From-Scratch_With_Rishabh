package array;

public class twoDarray {

    public static void main(String[] args) {

        int[][] arr; // declaration
        arr = new int[3][4]; // allocation

        int brr[][] = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
        };

        int rowlength = brr.length;
        int collength = brr[0].length;

        for (int row = 0; row <= rowlength - 1; row++) {

            for (int col = 0; col <= collength - 1; col++) {

                System.out.println(brr[row][col]);

            }
        }
    }
}