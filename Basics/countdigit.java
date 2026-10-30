
class countdigit {

    public static void main(String[] args) {
        int a = 54678;
        int count = 0;
        for (int i = 0; i < a; i++) {
            int lastdigit = a % 10;
            count++;
            a /= 10;
        }
        System.out.println(count);
    }

}
