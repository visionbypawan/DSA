class Solution {
    public int waysToSplitArray(int[] nums) {
        long total=0;
        long left=0;
        long right=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            right=total-left-nums[i];
            left+=nums[i];
            if(left>=right){
                j++;
            }

        }
        return j;
    }
}