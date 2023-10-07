public class Removeelement {
    public int removeElement(int[] nums, int val) {
        int a=0;
        int count=0;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
               temp[a]=nums[i];
               a++;
               count=count+1;
            }
        }
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        return count;
    }
}
