public class insertionsort {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=1;i<size;i++){
            int temp=i;
            while(arr[temp]<arr[temp-1]){
                int c=arr[temp];
                arr[temp]=arr[temp-1];
                arr[temp-1]=c;
                if(temp==1){
                      break;
                }
                 
                  temp--;
            }
            

        }
       

    }
}
