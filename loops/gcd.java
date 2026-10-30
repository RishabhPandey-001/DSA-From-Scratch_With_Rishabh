// class gcd {
//     public int findGCD(int[] nums) {
//         int min = nums[0];
//         int max = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             min = Math.min(min, nums[i]);
//             max = Math.max(max, nums[i]);
//         }
//         int gcd = 1;
//         for (int i = 1; i <= min; i++) {
//             if (min % i == 0 && max % i == 0) {
//                 gcd = i;
//             }
//         }
//         return gcd;
//     }
// }
// -------------------------------------------------
// class gcd {
//     public int findGCD(int[] nums) {
//         int min = nums[0];
//         int max = nums[0];
//         for (int num : nums) {
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//         }
//         for (int i = min; i >= 1; i--) {
//             if (min % i == 0 && max % i == 0) {
//                 return i;
//             }
//         }
//         return 1;
//     }
// }
// ========================

// Euclidean Algorithm  = GCD(a, b) = GCD(b, a % b)

// class gcd {
//     public int findGCD(int[] nums) {

//         int min = nums[0];
//         int max = nums[0];

//         for (int num : nums) {
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//         }

//         while (min != 0) {
//             int remainder = max % min;
//             max = min;
//             min = remainder;
//         }

//         return max;
//     }
// }



// Recursive Euclidean Algorithm  

// class gcd {

//     public int findGCD(int[] nums) {

//         int min = nums[0];
//         int max = nums[0];

//         for (int num : nums) {
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//         }

//         return gcd(max, min);
//     }

//     static int gcd(int a, int b) {

//         if (b == 0) {
//             return a;
//         }

//         return gcd(b, a % b);
//     }
// }
