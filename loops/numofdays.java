
import java.util.*;

public class numofdays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();
        int months = days / 30;
        int remaingdaysaftermonth = days % 30;
        int numOfweeks = remaingdaysaftermonth / 7;
        int numOfdays = remaingdaysaftermonth % 7;
        System.out.println("Number of months in entered days are: " + months);
        System.out.println("Number of months in entered days are: " + numOfweeks);
        System.out.println("Number of months in entered days are: " + numOfdays);

    }
}
