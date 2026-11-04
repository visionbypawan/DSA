import java.util.*;

class Solution {
    public int numberOfGoodPartitions(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store last occurrence of every number
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        int count = 0;
        int end = 0;

        // Find independent groups
        for(int i = 0; i < nums.length; i++) {

            end = Math.max(end, hm.get(nums[i]));

            if(i == end) {
                count++;
            }
        }

        // Calculate 2^(count-1) modulo 10^9 + 7
        long ans = 1;
        long MOD = 1_000_000_007;

        for(int i = 1; i < count; i++) {
            ans = (ans * 2) % MOD;
        }

        return (int)ans;
    }
}