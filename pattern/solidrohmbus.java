import java.util.*;
class solidrohmbus{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int n = sc.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int row = 1; row < n; row++) {

            // Print spaces
            for (int col = 1; col <(n- row); col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

}
}

//      *****
//     *****
//    *****
//   *****
//  *****
// *****

