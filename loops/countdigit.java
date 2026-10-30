public class countdigit{
    public static void main(String[] args) {
        int n = 57834;
        int count = 0;
        while (n != 0) { 
            int digit  = n %10;
            count += 1;
            n = n/10;
            
        }
        System.out.println(count);


    }

}