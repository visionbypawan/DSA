class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int max=Integer.MIN_VALUE;

        while(j>i){
            int sum=nums[i]+nums[j];
            max=Math.max(sum,max);
            i++;
            j--;

        }
        return max;
        
    }
}