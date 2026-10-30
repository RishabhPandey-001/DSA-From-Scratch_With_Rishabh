// Java program to find second largest element in an array
// using Sorting

// import java.util.*;

// class slargest {
    
//     // function to find the second largest element
//     static int getSecondLargest(int[] arr) {
//         int n = arr.length;
        
//         // Sort the array in non-decreasing order
//         Arrays.sort(arr);
        
//         // start from second last element as last element is the largest
//         for (int i = n - 2; i >= 0; i--) {
            
//             // return the first element which is not equal to the 
//             // largest element
//             if (arr[i] != arr[n - 1]) {
//                 return arr[i];
//             }
//         }
        
//         // If no second largest element was found, return -1
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 12, 35, 1, 10, 34, 1 };
//         System.out.println(getSecondLargest(arr));
//     }
// }





// Java program to find the second largest element in the array
// using two traversals

// import java.util.Arrays;

// class slargest {

//     // Function to find the second largest element in the array
//     static int getSecondLargest(int[] arr) {
//         int n = arr.length;

//         int largest = -1, secondLargest = -1;

//         // Finding the largest element
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > largest)
//                 largest = arr[i];
//         }

//         // Finding the second largest element
//         for (int i = 0; i < n; i++) {
            
//             // Update second largest if the current element is greater
//             // than second largest and not equal to the largest
//             if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         return secondLargest;
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};
//         System.out.println(getSecondLargest(arr));
//     }
// }




// ==============================================
// Java program to find the second largest element in the array
// using one traversal

// import java.util.Arrays;

// class slargest {
    
//     // function to find the second largest element in the array
//     static int getSecondLargest(int[] arr) {
//         int n = arr.length;

//         int largest = -1, secondLargest = -1;

//         // finding the second largest element
//         for (int i = 0; i < n; i++) {

//             // If arr[i] > largest, update second largest with
//             // largest and largest with arr[i]
//             if(arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             }
          
//             // If arr[i] < largest and arr[i] > second largest, 
//             // update second largest with arr[i]
//             else if(arr[i] < largest && arr[i] > secondLargest) {
//                 secondLargest = arr[i];
//             }
//         }
//         return secondLargest;
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};
//         System.out.println(getSecondLargest(arr));
//     }
// }





