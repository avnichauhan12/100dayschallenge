public class firstoccurence {
	public static int occurence(int arr[],int i,int n) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==n) {
			 return i;
		}
		return occurence(arr,i+1,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,51,23,8,23,51,2};
		
		int n=23;
        System.out.println(occurence(arr,0,n));
	}

}

