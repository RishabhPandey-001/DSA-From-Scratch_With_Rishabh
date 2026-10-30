class bubblesort{
public static void bubblesort(int[] arr, int n){
    for(int i = n-1; i>=0; i--){
        int didswap= 0;
        for(int j = 0; j<= i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didswap = 1;
                
            }
        }
        if(didswap == 0)
        break;
        System.out.println("Runs");
    }
}

public static void main(String[] args){
int [] arr = {9,13,20,24,46,52};
bubblesort(arr,arr.length);
System.out.print("Sorted array: ");
for(int x: arr){
    System.out.print(x + " ");
}
}
}