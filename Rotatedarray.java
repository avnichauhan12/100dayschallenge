public class Roatatedarray {
	public static int search(int arr[],int si,int e,int target) {
		if(si>e) {
			return -1;
		}
		int mid=(si+e)/2;
		System.out.println(arr[mid]);
		if(arr[mid]==target) {
			return mid;
			
		}
		// line 1
	    if(arr[si]<=arr[mid] ) {
	    	//case a : left
	    	if(arr[si] <= target && target <= arr[mid]) {
	    		return search(arr,si,mid-1,target);
	    	}
	    	else {
			    return search(arr,mid+1,e,target);
	    	}
		}
	    //else line 2
		else {
			if(arr[mid] <= target && target <= arr[e]) {
	    		return search(arr,mid+1,e,target);
	    	}
	    	else {
			    return search(arr,si,mid-1,target);
	    	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2,3};
        System.out.println(search(arr,0,arr.length-1,0));
	}

}
