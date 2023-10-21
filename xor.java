public class xor {
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans = ans^nums[i];
            System.out.println(ans);
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,2,4};
		System.out.println(singleNumber(arr));

	} 
}
