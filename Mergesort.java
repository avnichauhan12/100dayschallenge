public class Mergesort {
    public static void mergesort(int s,int l,int arr[]) {
		
		if(s>=l) {
			return;
		}
		int mid=(s+l)/2;
		   mergesort(s,mid,arr);
		   mergesort(mid+1,l,arr);
		   merge(s,l,mid,arr);
	}
	public static void merge(int s,int l,int mid,int arr[]) {
		int temp[]=new int[l-s+1];
		int i=s; //left part
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=l) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
				k++;
			}
			else {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			temp[k]=arr[i];
			i++;
			k++;
		}
		while(j<=l) {
			temp[k]=arr[j];
			j++;
			k++;
		}
		for(int w=0,h=s;w<temp.length;w++,h++) {
			arr[h]=temp[w];
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1,6,5,8};
		mergesort(0,arr.length-1,arr); 
		for(int w=0;w<arr.length;w++) {
			System.out.println(arr[w]);
		}
	}

}
