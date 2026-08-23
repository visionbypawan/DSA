class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
        int right=0;
        int left=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right=total-nums[i]-left;
            ans[i]=Math.abs(right-left);
            left+=nums[i];
        }
        return ans;

        
    }
}