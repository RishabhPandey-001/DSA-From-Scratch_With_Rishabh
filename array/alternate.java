// print extreme elements in alternate manner 
class alternate{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            System.out.print(arr[left] + " ");
            left++;

            if (left <= right) {
                System.out.print(arr[right] + " ");
                right--;
            }
        }
    }
}