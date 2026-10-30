
class switchcaseafterjava5 {

    public static void main(String[] args) {
        String day = "Monday";
        // switch (day) {
        //     case "saturday" , "sunday":
        //         System.out.println("6 am");
        //         break;
        //         case "Monday":
        //         System.out.println("8 am");
        //         break;
        //         case "Tuesday":
        //         System.out.println("7 am");
        //         break;
        //         case "Wednesday":
        //         System.out.println("7 am");
        //         break;
        //         case "Thursday":
        //         System.out.println("7 am");
        //         break;
        //         case "Friday":     
        //         System.out.println("7 am");
        //         break;
        //     default:
        //         System.out.println("Enter a valid day ");    
        // }





//from java 12 

    //    switch(day){
    //    case "saturday" , "sunday" -> System.out.println("6 am");   
    //    case "Monday" -> System.out.println("8 am");
    //    case "Tuesday" -> System.out.println("8 am");
    //    case "Wednesday" -> System.out.println("       ");
    //    case "Thursday" -> System.out.println("8 am");
    //    case "Friday" -> System.out.println("8 am");
    // default -> System.out.println("Enter a valid day");





    String result = "";
      result = switch(day){
       case "saturday" , "sunday" ->  "6 am";//lace of -> you can you yield keyword also : case "saturday" , "sunday": yield "6 am";
       case "Monday" -> "8 am";
       case "Tuesday" -> "8 am";
       case "Wednesday" -> "8 am";
       case "Thursday" -> "8 am";
       case "Friday" -> "8 am";
       default -> "Enter a valid day";

// since this is an expression so we need to give semi colon also 
       };
    }
}