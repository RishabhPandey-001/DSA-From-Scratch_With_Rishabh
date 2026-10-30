
import java.util.Scanner;

public class forloop{
    public static void main(String[] args) {
       // given us number of days  ===  105
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of days: ");
       int days = sc.nextInt();
        int month = 0;
        int week = 0;
        while (days >= 30) { 
            month++;
            days = days -30;
        }
        while (days >= 7 ) { 
            week++;
            days = days -7;
        }

        System.out.println("month" + month);
        System.out.println("weekks" + week);
        System.out.println("days" + days);

    }
}












//        int remainingdays = 0;
//        int currentdays = 0;
//        int month = days/30;   
//         remainingdays = days % 30;

//         int week = remainingdays / 7;
        
//         int day = remainingdays % 7;
//         System.out.println("Months: " + month);
//         System.out.println("weeks: " + week);
//         System.out.println("days: " + day);
//     }
// }
    // System.out.println("month :"+days/30);
    // System.out.println("weaks :"+(days/30)/7);
    // System.out.println("days :"+(days%30)%7);


    // for (int i = 1; i <= 100; i++) {
    //     if (i == 95) {
    //         break;
    //     }
    //     System.out.println(i);
    // }

    // System.out.println( " enter the number of days");

// int days= sc.nextInt();

// int month= days/ 30;
// days = days - (month*30);
// int weeks= days/7;
// days = days - (weeks*7);

// System.out.println ("months: " + month);
// System.out.println ( " weeks: " + weeks);
// System.out.println ( "days: " + days);

//     }
// }













