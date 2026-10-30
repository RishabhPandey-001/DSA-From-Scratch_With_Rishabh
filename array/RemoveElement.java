package array;
class RemoveElement {
    public static void main(String[] args) {
        int[] a={10, 20, 30, 40, 50, 60, 70};
        int[] b=removeElement(a, 3);
        for(int n:a){
            System.out.print(n+" ");
        }
        System.out.println();
         for(int n:b){
            System.out.print(n+" ");
        }
    }

    public static int[] removeElement(int[] a, int index) {
        if (index < 0 || index >= a.length) {
            System.out.println("Index out of bounds");
            return a;
        }
        int[] b=new int[a.length-1];
        for(int i=0;i<b.length;i++){
            if(i<index)
                b[i]=a[i];
            else
                b[i]=a[i+1];
        }
    return b;   
    }
}
