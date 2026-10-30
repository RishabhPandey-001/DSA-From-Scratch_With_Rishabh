// Introduction to Arrays

// An array is a collection of elements of the same data type, stored under a single variable name and accessed using an index.
// int[] marks = {85, 76, 91, 68, 88};
// int [] marks = new marks[10];
// import java.util.*;
// public class Tutorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int[] arr = {1,2,4,5,6}; // 0 to n-1
//         System.out.println(arr[0]);
//         System.out.println(arr[1]);
//         System.out.println(arr[2]);
//         System.out.println(arr[3]);  
//         System.out.println(arr[4]);
//         System.out.println(arr[5]);
// for(int i = 0; i < n; i++) {
//     arr[i] = sc.nextInt();
// }
// for(int i = 0; i < n; i++) {
//     System.out.println(arr[i]);
// }
//     }
// }
// Index:    0    1    2    3    4
//          -------------------------
// marks:  | 85 | 76 | 91 | 68 | 88 |   4 * 5 = 20bytes
//          -------------------------
//  100   104   108  112  116
// Index always starts from 0
// why there is 0 based indexing in array in java
// An array is a contiguous block of memory. The element's address is calculated as:
// address of arr[i] = base address + (i × size of each element)
// The first element sits at the base address itself, so its offset is 0. With 0-based indexing,
//  the index is the offset, and the computer does a simple multiply-and-add. With 1-based indexing, 
//  it would have to compute base + (i - 1) × size every time, which adds a subtraction on each access.
//   That was a real cost on early hardware.
// Declaring an Array
// Form 1
// int[] arr;         
// Form 2
// int arr[];
// valid, but less preferred.
// Multiple declarations
// int[] a, b;
// Creating an Array
// int[] arr = new int[5]; {1,2,3,45,5}
// int[]       → array of integers
// arr         → reference variable
// new         → creates object
// int[5]      → 5 integer locations
// public class Tutorial {
//     public static void main(String[] args) {
//         // int[] arr = new int[5];
//          int [] arr = {0,1,2,3,4,5};
//         System.out.println(arr.length);
//     }
// }
// Initialization
// Declaration + initialization
// int[] arr = {10, 20, 30, 40, 50};
// or 
// int[] arr = new int[]{10, 20, 30, 40, 50};
// Array Length
// arr.length
// length is a property, not a method.
// System.out.println(arr.length);
// for ex = int[] arr = {10,20,30,40,50};
// arr.length
// 5
// Taking Array Input
// public class Tutorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//  System.out.print("Enter the length of array: ");
// int[] arr = new int[5];
//   System.out.print("Enter the Elements of array: ");
// for(int i = 0; i < n; i++) {
//     arr[i] = sc.nextInt();
// }
//  System.out.println("Printing the elements of array: ");
// for(int i = 0; i < arr.length; i++){
//     if(arr[i] == 8){
//         System.out.print(i);
//     }
// }
// for(int i = 0; i < n; i++) {
//     System.out.println(arr[i]);
// }
//         int [] arr = { 10,20,30,40,50};
//         for(int i: arr){
//             System.out.println(i);
//         }
//     }
// }
// Traversing an Array
// int[] arr = {10, 20, 30, 40, 50};
// for(int i = 0; i < arr.length; i++) {
//     System.out.println(arr[i]);
// }
// Enhanced For Loop
// for(int x : arr) {
//     System.out.println(x);
// }
// Basic Array Programs
// Program 1 — Print all elements
// for(int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i] + " ");
// }
// Program 2 — Sum
// int sum = 0;
// for(int i = 0; i < arr.length; i++) {
//     sum += arr[i];
// }
// System.out.println(sum);
// Program 3 — Average
// double sum = 0;
// for(int x : arr) {
//     sum += x;
// }
// double average = sum / arr.length;
// System.out.println(average);
// Program 4 — Maximum
// int max = arr[0];
// for(int i = 1; i < arr.length; i++) {
//     if(arr[i] > max) {
//         max = arr[i];
//     }
// }
// System.out.println(max);
// Program 5 — Minimum
// int min = arr[0];
// for(int i = 1; i < arr.length; i++) {
//     if(arr[i] < min) {
//         min = arr[i];
//     }
// }
// System.out.println(min);
// Module 12 — Important Array Problems
// Teach these as your first practice set:
// Count even numbers
// Count odd numbers
// Count positive numbers
// Count negative numbers
// Find maximum
// Find minimum
// Find sum
// Find average
// Find second largest
// Find second smallest
// Reverse an array
// Copy an array
// Count occurrences of a number
// Find duplicate elements
// Find unique elements
// Check whether array is sorted   
// Find frequency of each element
// Searching
// import java.util.*;
// public class Tutorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int [] arr = {10,20,50,40,62};
//         int target = 45;
//         int index = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 index = i;
//                 break;
//             }
//         }
//         System.out.println(index);
//     }
// }
// { 1 ,2,3,,5,4,6}
// 2D Arrays
// A 1D array represents a linear collection. What if we want rows and columns?
// 10 20 30
// 40 50 60
// 70 80 90
// Declaration:
// int[][] arr;
// Creation:
// int[][] arr = new int[3][3];
//        columns
//        0   1   2
//      -----------
// 0 → | 10  20  30 |
// 1 → | 40  50  60 |
// 2 → | 70  80  90 |
// 2D Array Initialization
// int[][] matrix = {
//     {10, 20, 30},
//     {40, 50, 60},
//     {70, 80, 90}
// };
// System.out.println(matrix[0][0]);
// 2D Array Traversal
// for(int i = 0; i < matrix.length; i++) {
//     for(int j = 0; j < matrix[i].length; j++) {
//         System.out.print(matrix[i][j] + " ");
//     }
//     System.out.println();
// }
// Outer loop → rows
// Inner loop → columns
// int rows = sc.nextInt();
// int cols = sc.nextInt();
// int[][] matrix = new int[rows][cols];
// for(int i = 0; i < rows; i++) {
//     for(int j = 0; j < cols; j++) {
//         matrix[i][j] = sc.nextInt();
//     }
// }
// printing : 
// System.out.println("Printing 2d matrix after input: ");
// for(int i = 0; i < rows; i++) {
//     for(int j = 0; j < cols; j++) {
//         System.out.print(matrix[i][j] + " ");
//     }
//     System.out.println();
// }
// import java.util.*;

// class Tutorial {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int[][] matrix = {
//             {4, 2, 6},
//             {1, 5, 3},
//             {8, 2, 7}
//             };
//         int sum = 0; //12 + 9 +  17  
//         for (int i = 0; i < matrix.length; i++) {   
//             for (int j = 0; j < matrix[i].length; j++) {
//                 sum += matrix[i][j];
                 
//             }
//              System.out.println("");
          
//         }
//          System.out.println(sum);
       
        
//     }
// }
// 2D Array Problems
// Sum of all elements
// int sum = 0;
// for(int i = 0; i < matrix.length; i++) {
//     for(int j = 0; j < matrix[i].length; j++) {
//         
//     }
// }
// HW:  1. Maximum element  
//      2. Minimum element  
// Row-wise sum
// for(int i = 0; i < matrix.length; i++) {
//     int sum = 0;
//     for(int j = 0; j < matrix[i].length; j++) {   
//         sum += matrix[i][j];
//     }
//     System.out.println("Row sum = " + sum);
// }
// column wise HW
// Matrix multiplication
// This is a very useful nested-loop problem.

// for(int i = 0; i < rowsA; i++) {
//     for(int j = 0; j < colsB; j++) {
//         for(int k = 0; k < colsA; k++) {
//             result[i][j] += A[i][k] * B[k][j];
//         }
//     }
// }
// mathmatical solution discuss 
// Limitations of Arrays
// If arrays are so useful, why do we need ArrayList?
// Problem 1 — Fixed size
// int[] arr = new int[5];  //annot directly become size 10.
// Problem 2 — Insertion/deletion is inconvenient
// Problem 3 — Built-in operations are limited
// Problem 4 — No dynamic resizing
// This creates the motivation for:  ArrayList
// Introduction to ArrayList
// definition :  ArrayList is a resizable array implementation provided by the Java Collections Framework
// import java.util.ArrayList;
// craete : ArrayList<Integer> numbers = new ArrayList<>();
// Array
// ↓
// fixed size
// ArrayList
// ↓
// dynamic/resizable
// ArrayList vs Array
// | Feature               | Array           | ArrayList            |
// | --------------------- | --------------- | -------------------- |
// | Size                  | Fixed           | Dynamic              |
// | Syntax                | `int[]`         | `ArrayList<Integer>` |
// | Primitive types       | Yes             | No directly          |
// | Objects               | Yes             | Yes                  |
// | Indexing              | Yes             | Yes                  |
// | `length`              | Yes             | No                   |
// | `size()`              | No              | Yes                  |
// | Add element           | Manual          | `add()`              |
// | Remove                | Manual shifting | `remove()`           |
// | Collections Framework | No              | Yes                  |

// Creating ArrayList
// ArrayList<Integer> numbers = new ArrayList<>();
// You can also specify initial capacity:
// ArrayList<Integer> numbers = new ArrayList<>(20);
// Initial capacity and size are not the same thing.
// ArrayList<Integer> list = new ArrayList<>(20);
// does not mean that the list already contains 20 elements.
// Its size is still:  0
// Adding Elements
// ArrayList<Integer> numbers = new ArrayList<>();
// numbers.add(10);
// numbers.add(20);
// numbers.add(30);
// Accessing Elements
// System.out.println(numbers.get(0)); 
// numbers[0]    // Wrong
// in arrays :  arr[0] 
// but in arraylist :  list.get(0)
// Updating Elements
// numbers.set(1, 100);
// before : [10, 20, 30]
// after :  [10, 100, 30]
// Removing Elements
// numbers.remove(1);  //100
// important :
// ArrayList<Integer> list = new ArrayList<>();
// list.add(10);
// list.add(20);
// list.add(30);
// list.remove(1);
// This removes index 1:  [10, 30]
// but list.remove(Integer.valueOf(10));   // removes the value 10 from arraylist 
// ArrayList Size
// in array :  arr.length
//  but in arraylist :  list.size()
// finding index : 
// numbers.indexOf(20);
// Last occurrence:
// numbers.lastIndexOf(20);
// ArrayList Traversal
//     for(int i = 0; i < numbers.size(); i++) {
//     System.out.println(numbers.get(i));
// }
// using for each loop 
// for(int x : numbers) {
//     System.out.println(x);
// }
// Why ArrayList<int> Doesn't Work
// Wrong:  ArrayList<int> list;
// Correct:  ArrayList<Integer> list;
// Because Java collections work with objects, not primitive types.
// Useful ArrayList Methods
// add()
// get()
// set()
// remove()
// size()
// contains()     
// indexOf()
// lastIndexOf()
// clear()
// isEmpty()
import java.util.*;
class Tutorial{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

System.out.println(list);
// list.set(1, 200);
// System.out.println(list);
// System.out.println(list.get(1));
// System.out.println(list.contains(20));
// System.out.println(list.size());
// list.remove(0);
// System.out.println(list);
// list.clear();
// System.out.println(list.isEmpty());

    }
}




// ArrayList<String> fruits = new ArrayList<>();

// fruits.add("Apple");              // add to end
// fruits.add("Banana");
// fruits.add(1, "Mango");           // insert at index 1
// // [Apple, Mango, Banana]

// System.out.println(fruits.get(0));   // Apple
// fruits.set(2, "Orange");             // replace -> [Apple, Mango, Orange]

// fruits.remove("Mango");              // remove by value
// fruits.remove(0);                    // remove by index
// // [Orange]

// System.out.println(fruits.size());       // 1 (size(), not length)
// System.out.println(fruits.contains("Orange")); // true
// System.out.println(fruits.indexOf("Orange"));  // 0
// System.out.println(fruits.isEmpty());          // false
// fruits.clear();  



// ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C"));

// for (int i = 0; i < list.size(); i++) {
//     System.out.println(list.get(i));
// }

// for (String s : list) {
//     System.out.println(s);
// }

// list.forEach(s -> System.out.println(s));   // lambda style                              // remove everything



// sorting in arraylist 
// import java.util.Collections;

// ArrayList<Integer> nums = new ArrayList<>(List.of(5, 2, 8, 1));
// Collections.sort(nums);                         // ascending
// Collections.sort(nums, Collections.reverseOrder()); // descending



// Gotcha: removing an Integer
// ArrayList<Integer> nums = new ArrayList<>(List.of(10, 20, 30));
// nums.remove(1);                    // removes INDEX 1 -> [10, 30]
// nums.remove(Integer.valueOf(10));  // removes VALUE 10 -> [30]


// import java.util.*;

// public class Tutorial {
//     public static void main(String[] args) {
//         // Array: average of fixed scores
//         int[] scores = {80, 90, 70, 100};
//         int sum = 0;
//         for (int s : scores) sum += s;
//         System.out.println("Average: " + (double) sum / scores.length);

//         // ArrayList: collect even numbers dynamically
//         ArrayList<Integer> evens = new ArrayList<>();
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) evens.add(i);
//         }
//         System.out.println("Evens: " + evens);   // [2, 4, 6, 8, 10]
//     }
// }