import java.util.*;

class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row number: ");
        int n = sc.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n) {

        for (int row = 1; row <= n; row++) {

                if (row == 1 || row ==2 || row == n) {
                    for(int col =1;  col<=row; col++){
                    System.out.print("* ");
                }
                }
                else {
                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}