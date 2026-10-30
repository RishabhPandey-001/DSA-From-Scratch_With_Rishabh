
public class multiplyeachelement {

    static int getmultiple(int[] arr) {

        int multiple = 1;

        for (int i = 0; i < arr.length; i++) {
            multiple = multiple * arr[i];
        }

        return multiple;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 6, 8, 9};

        System.out.println(getmultiple(arr));
    }
}

