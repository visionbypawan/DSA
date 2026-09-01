class Solution {
    public static int leftsmall(int[] nums){
        int l=0;
        int mid=l+(nums.length-1-l)/2;
        int r=mid-1;
        int small=nums[mid];
        while(l<=r){
            mid=l+(r-l)/2;
            if(small>nums[mid]){
                small=nums[mid];
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return small;
    }
    public static int rightsmall(int[] nums){
        int mid=0+(nums.length-1-0)/2;
        int l=mid+1;
        int r=nums.length-1;
        int small=nums[mid];
        while(l<=r){
            mid=l+(r-l)/2;
            if(small>nums[mid]){
                small=nums[mid];
                
                r=mid-1;
            }else{
                
                l=mid+1;
            }
        }
        return small;
    }
    public int findMin(int[] nums) {
        int right=rightsmall(nums);
        int left=leftsmall(nums);
        return Math.min(right,left);
        
    }
}