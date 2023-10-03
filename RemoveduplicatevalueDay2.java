import java.util.Scanner;

public class RemoveduplicatevalueDay2 {
	public static int removeDuplicates(int[] nums) {
        int a=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
           int curr=nums[i];
           if(curr!=nums[i+1]){
               nums[a]=nums[i+1];
               a=a+1;
               count=count+1;
           }
           
        }
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=ob.nextInt();
		}
		int result=removeDuplicates(nums);
		System.out.println(result);
	}

}