class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int pro1 = nums[0];
        int pro2 = nums[0];
        int ans=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = pro1;
                pro1 = pro2;
                pro2 = temp;
            }
            pro1 = Math.max(nums[i], nums[i] * pro1);
            pro2 = Math.min(nums[i], nums[i] * pro2);
            ans=Math.max(pro1,ans);

        }
        return ans;

    }
}