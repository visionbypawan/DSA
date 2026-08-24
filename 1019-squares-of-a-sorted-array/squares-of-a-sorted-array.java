class Solution {
    public int[] sortedSquares(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }

            }
            if (swap == false) {
                break;
            }
        }
        return nums;    
    }
}