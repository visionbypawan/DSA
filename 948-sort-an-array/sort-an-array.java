
import java.util.*;

class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int si, int ei) {
        if (si >= ei) return;

        int randomIndex = si + rand.nextInt(ei - si + 1);
        int pivot = nums[randomIndex];

        int lt = si, i = si, gt = ei;

        while (i <= gt) {
            if (nums[i] < pivot) {
                int temp = nums[lt];
                nums[lt++] = nums[i];
                nums[i++] = temp;
            }
            else if (nums[i] > pivot) {
                int temp = nums[gt];
                nums[gt--] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }

        quickSort(nums, si, lt - 1);
        quickSort(nums, gt + 1, ei);
    }
}
