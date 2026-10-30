// Method Syntax
// accessModifier static returnType methodName(parameters) {
//     // method body
// }

// example  :  
//  public static int add(int a, int b) {
//     return a + b;
// }

// public       → access modifier
// static       → method belongs to class
// int          → return type
// add          → method name
// (int a, int b) → parameters
// return       → sends value back


// Method Declaration vs Method Definition
// static int add(int a, int b) {
//     return a + b;
// }

// Calling / Invoking a Method
// static void greet() {
//     System.out.println("Hello");
// }

// public static void main(String[] args) {
//     greet();
// }


// Method definition → creating the method

// Method call/invocation → executing the method


// void Methods
// static void welcome() {
//     System.out.println("Welcome");
// }


// static void printName() {
//     System.out.println("Rishabh");
// }

// static void printTable(int n) {
//     for (int i = 1; i <= 10; i++) {
//         System.out.println(n * i);
//     }
// }

//Parameters  

// Return Values
// static int add(int a, int b) {
//     return a + b;
// }

// static int add(int a, int b) {
//     return a + b;
// }

// 10,20
//  ↓
// add()
//  ↓
// 30
//  ↓
// result



// Very important conceptual difference:

// System.out.println() displays a value.
// return sends a value back to the caller.



// Local Variables Inside Methods
// Scope of Variables


// Types of Methods
// A. No argument, no return


// static void greet() {
// }


// B. Argument, no return

// static void greet(String name) {
// }



// C. No argument, return value
// static int getNumber() {
//     return 10;
// }

// D. Argument and return value

// static int add(int a, int b) {
//     return a + b;
// }


// Method Calling Flow

// public static void main(String[] args) {

//     int result = add(10, 20);

//     System.out.println(result);
// }

// static int add(int a, int b) {

//     int sum = a + b;

//     return sum;
// }

// main()
//  ↓
// add(10,20)
//  ↓
// a = 10
// b = 20
//  ↓
// sum = 30
//  ↓
// return 30
//  ↓
// result = 30




// Stack and Method Calls
// main()
//   ↓
// calculate()
//   ↓
// add()

// STACK

// ┌─────────────┐
// │ add()       │
// ├─────────────┤
// │ calculate() │
// ├─────────────┤
// │ main()      │
// └─────────────┘


// When add() finishes, its stack frame is removed.

