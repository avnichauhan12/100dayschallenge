public class selectionsort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                     min=arr[j];
                     index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}
