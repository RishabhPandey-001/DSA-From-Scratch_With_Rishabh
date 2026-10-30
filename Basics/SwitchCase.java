// import java.util.*;

// class SwitchCase {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int a = 3;
       

    //    if (a == 1) {
    //        System.out.println("Monday");
    //    }
    //    else if (a == 2) {
    //        System.out.println("Tuesday");
    //    }

    //    else if (a == 3) {
    //        System.out.println("wednesday");
    //    }
    //    else if (a == 4) {
    //        System.out.println("thursday");
    //    }
    //    else if (a == 5) {
    //        System.out.println("friday");
    //    }
    //    else if (a == 6) {
    //        System.out.println("sat");
    //    }
    //    else if (a == 7) {
    //        System.out.println("sun");
    //    }
    //    else{
    //     System.out.println("Enter a valid day");
    //    }



// int a = 3;


// switch (a) {
//   case 1:
//         System.out.println("Monday");
       
//     case 2:
//         System.out.println("Tuesday");
       
//     case 3:
//         System.out.println("Wednesday");
       
       
//     case 4:
//         System.out.println("Thursday");
        
//     case 5:
//         System.out.println("Friday");
        
//     case 6:
//         System.out.println("Saturday");
        
//     case 7:
//         System.out.println("Sunday");
//         break;
//     default:
//         System.out.println("Enter a valid day ");
     
// }



    // int a = 2;
    // switch (a) {
    //     case 1->System.out.println("Mon");
    //     case 2->System.out.println("tue");//
    //     case 3->System.out.println("wed");
    //     case 4->System.out.println("thur");
    //     case 5->System.out.println("fri");
    //     case 6->System.out.println("sat");
    //     case 7->System.out.println("sun");
        
    // }

// import java.util.Scanner;

// public class SwitchCase {

//     public static void main(String[] args) {  //int char short byte string enum 

//         Scanner sc = new Scanner(System.in);

//         // System.out.print("Enter a day: ");
//         String name = "Sunday";

//         String result = switch (name) {

//             case "Saturday", "Sunday","Wednesday" -> "6 AM";

//             case "Monday" -> "8 AM";

//             case "Tuesday" -> "8 AM";

//             case "Thursday" -> "8 AM";

//             case "Friday" -> "8 AM";

//             default -> "Enter a valid day";
//         };

//         System.out.println("College starts at: " + result);

//         sc.close();
//     }
// }







import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = sc.nextLine();

        String result = switch (day) {

            case "Monday":
                yield "8 AM";

            case "Tuesday":
                yield "8 AM";

            case "Wednesday":
                yield "6 AM";

            case "Thursday":
                yield "8 AM";

            case "Friday":
                yield "8 AM";

            case "Saturday":
            case "Sunday":
                yield "6 AM";

            default:
                yield "Enter a valid day";
        };

        System.out.println("College starts at: " + result);

        sc.close();
    }
}












        // switch (a){
        //     case 1:  
                
                
        //     default:
                
        // }

        // if (a == 1){
        //     System.out.println("Monday");
        // }
        // else if(a == 2){
        //      System.out.println("Tuesday");
        // }
        //    else if(a==3){
        //     System.out.println("Wednesday");
        //    }
        // else{
        //     System.out.println("Enter a valid day");
        // }
        









        
       // first else if then same with switch case  /// after condition met : This is called fall-through.
    
        
//     }
// }