
class reversenum {

    public static void main(String[] args) {
        int a = 54321;
        int reverse = 0;
        while (a > 0) {
            int ls = a % 10;

            reverse = reverse * 10 + ls;
            a = a / 10;
        }
        System.out.println(reverse);
    }

}
