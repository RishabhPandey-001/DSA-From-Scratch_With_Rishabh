import java.util.Arrays;

class setmismatch645 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};

        setmismatch645 obj = new setmismatch645();
        int[] result = obj.findErrorNums(arr);

        System.out.println(Arrays.toString(result));
    }

    public int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}