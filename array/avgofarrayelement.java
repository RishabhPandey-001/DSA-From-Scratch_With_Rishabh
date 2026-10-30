
public class avgofarrayelement {

    static double getaverage(int[] arr) {

        int sum = 0;

        for (int i : arr) {
            sum = sum + i;
        }

        int size = arr.length;

        double avg = (double) sum / size;

        return avg;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 6, 8, 9};

        System.out.println(getaverage(arr));
    }
}