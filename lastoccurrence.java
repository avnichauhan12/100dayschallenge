public class lastoccurrence {
    public static int occurrence(int arr[],int i,int n) {
		if(i==-1) {
			return -1;
		}
		if(arr[i]==n) {
			return i;
		}
		return occurrence(arr,i-1,n);
	}
	public static void main(String[] args) {
		int arr[]= {1,5,2,7,2,6,2,8};
		int n=2;
		int result=occurrence(arr,arr.length-1,n);
		System.out.println(result);
	}
}
