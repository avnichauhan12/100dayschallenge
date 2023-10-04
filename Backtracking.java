
public class Backtracking {
	public static void change(int arr[],int i,int value) {
		if(i==arr.length) {
			return;
		}
		arr[i]=value;
		change(arr,i+1,value+2);
	}
	
	public static void main(String [] args) {
		int arr[]=new int[7];
		change(arr,0,1);
		for(int i=0;i<7;i++) {
			System.out.println(arr[i]);
		}
	}

}
