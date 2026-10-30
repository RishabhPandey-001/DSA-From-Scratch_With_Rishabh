
class palindrome {

    public static void main(String[] args) {
        int a = 1002;
        int temp = a;
        int reverse = 0;
        while (a > 0) {
            int ls = a % 10;

            reverse = reverse * 10 + ls;
            a = a / 10;
        }
        if (temp == reverse) {
            System.out.println("This is palindrome number");
        } else {
            System.out.println("No this is not a palindrome");
        }
    }

}
