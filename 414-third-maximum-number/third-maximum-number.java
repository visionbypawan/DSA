class Solution {
    public int thirdMax(int[] nums) {
        int loc=-1;
        int max1=Integer.MIN_VALUE;
        for(int n:nums){
            max1=Math.max(n,max1);
        }
        int max2=Integer.MIN_VALUE;
        for(int n:nums){
            if(n>max2 && n!=max1){
                max2=n;
            }
        }
        int max3=Integer.MIN_VALUE;
        for(int n:nums){
            if(n>=max3 && n!=max1 && n!=max2){
                max3=n;
                loc=1;
            }
        }
        return (loc==1)? max3:max1;
        
    }
}