class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int maxsum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],nums[i]+max);
            maxsum=Math.max(maxsum,max);
            min=Math.min(nums[i],nums[i]+min);
            minsum=Math.min(minsum,min);
        }
        
        return Math.max(maxsum,Math.abs(minsum));

    }
}