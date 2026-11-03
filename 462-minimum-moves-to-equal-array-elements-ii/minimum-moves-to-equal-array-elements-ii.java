import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int sum = 0;
        for (int num : nums) {
            sum += Math.abs(num - median);
        }
        return sum;
    }
}