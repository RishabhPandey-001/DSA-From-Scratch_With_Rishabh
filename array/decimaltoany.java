
public class decimaltoany {
    // Convert a character to its numeric value
    static int getValue(char ch)
    {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }
        return ch - 'A' + 10;
    }

    static int decimalEquivalent(String s, int b)
    {
        int n = s.length();
        int res = 0;
        // Process from right to left
        for (int i = n - 1; i >= 0; i--) {
            int digit = getValue(s.charAt(i));
            int power = n - 1 - i;
            res += digit * Math.pow(b, power);
        }
        return res;
    }

    public static void main(String[] args)
    {
        String s = "1A";
        int b = 16;
        System.out.println(decimalEquivalent(s, b));
    }
}