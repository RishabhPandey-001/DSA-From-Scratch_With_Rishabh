class variabless {
    public static void main(String[] args) {
                
        int age;       
        age  =  16;
                                                                                                                                                                                                                System.out.println("Age: " + age); 
        age = age+5;
        char part;
        String name = "This is a brilliant section"; 
        
       
        float salary = 50000.50f;     
        char section = 'E';
        part = 'K';
        
        System.out.println("Age: " + age);          
        System.out.println("Name: " + name);        
        System.out.println("Salary: " + salary);
        System.out.println("Section: " + section);  
        System.out.println("Part: " + part);          
        

    }
}

//static variable : A static variable is shared by all objects of a class.
// class Student {
//     static String college = "ABC University";
//     String name;
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student();

//         System.out.println(s1.college); // ABC University
//         System.out.println(s2.college); // ABC University
//     }
// }





// Static Method:  A static method belongs to the class and can be called without creating an object.

// class MathUtils {
//     static int square(int x) {
//         return x * x;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         System.out.println(MathUtils.square(5)); // 25
//     }
// }