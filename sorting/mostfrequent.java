class mostfrequent{
static int mostfrequent(int[] arr){
    int n = arr.length;
    int maxcount = 0;
    int result = 0;
    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if(arr[i] == arr[j]){
                count++;
            }
            if( count> maxcount || (count == maxcount && arr[i] > result)){
                maxcount = count;
                result = arr[i];
            }
        }
        
    }
    return result;
}
    public static void main(String[] args) {
      int[] arr = { 40, 50, 30, 40, 50, 30, 30};
        System.out.println(mostfrequent(arr));
    }
}