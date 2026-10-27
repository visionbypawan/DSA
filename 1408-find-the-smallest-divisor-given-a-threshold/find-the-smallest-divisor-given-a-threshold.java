class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        int min=1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        while(max>min){
            int mid=min+(max-min)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum>threshold){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
        
    }
}