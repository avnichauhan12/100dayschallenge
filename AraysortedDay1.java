//package pack1;

public class AraysortedDay1 {
	public static boolean sorted(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
		}
	
		 if(arr[i]>arr[i+1]) {
			 return false;
		 }

			 return sorted(arr,i+1);
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,8,34,56};
		boolean result=sorted(arr,0);
		System.out.println(result);

	}

}