
public class anytodecimal {

    // Convert numeric value to character
    static char getChar(int value) {

        if (value >= 0 && value <= 9) {
            return (char) ('0' + value);
        }

        return (char) ('A' + value - 10);
    }

    static String decimalToBase(int n, int b) {

        if (n == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (n > 0) {

            int remainder = n % b;

            result.append(getChar(remainder));

            n = n / b;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        int n = 26;
        int b = 16;

        System.out.println(decimalToBase(n, b));
    }
}
