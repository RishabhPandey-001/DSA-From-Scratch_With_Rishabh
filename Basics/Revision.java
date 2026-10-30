
import java.util.Scanner;

public class Revision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum marks  of a subject: ");
        Float maxiMarks = sc.nextFloat();

        System.out.print("Enter the marks  of maths: ");
        Float maths = sc.nextFloat();

        System.out.print("Enter the marks  of science: ");
        Float science = sc.nextFloat();

        System.out.print("Enter the marks  of Cs: ");
        Float cs = sc.nextFloat();

        System.out.print("Enter the marks  of eng: ");
        Float eng = sc.nextFloat();
        System.out.print("Enter the marks  of phy: ");
        Float phy = sc.nextFloat();

        Float totalMarks = maxiMarks * 5;

        Float Obtained_marks = maths + cs + eng + phy + science;

        Float percentage = (Obtained_marks / totalMarks) * 100;
        System.out.print("The percentage of student is: " + percentage);
    }
}
