class Solution {
    public int minimumAverageDifference(int[] nums) {
        long total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        long sum=0;
        int finall=0;
        long ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            long min;
            sum+=nums[i];
            if(nums.length==i+1){
                min=Math.abs(0-(sum/(i+1)));


            }else{
                min=Math.abs(((total-sum)/(nums.length-(i+1)))-(sum/(i+1)));
            }
            if(ans>min){
                finall=i;
                ans=min;
            }
        }
        return finall;
        
    }
}