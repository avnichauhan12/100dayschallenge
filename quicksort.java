public class quicksort {
    public static void quick(int arr[],int s,int l) {
		if(s>=l) {
			return;
		}
		int pi=partition(arr,s,l);
		quick(arr,s,pi-1);
		quick(arr,pi+1,l);
	}
	public static int partition(int arr[],int s,int l) {
		int p=arr[l];
		int i=s-1;
		for(int j=s;j<l;j++) {
			
			if(arr[j]<=p) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		int temp=p;
		arr[l]=arr[i];
		arr[i]=temp;
		return i;
		
	}

	public static void main(String[] args) {
		int arr[]= {3,5,4,2,1,9,6};
		quick(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

}
