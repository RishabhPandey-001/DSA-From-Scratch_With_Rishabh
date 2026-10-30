
import java.util.Scanner;

class areaofcircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //area of circle = pi * r *r ;
        System.out.println("Enter radius of circle: ");
        Float radius = sc.nextFloat();
        Double perimeter = (3.14 * 2 * radius);
        System.out.println("perimeter of circle is:  " + perimeter);

    }
}
