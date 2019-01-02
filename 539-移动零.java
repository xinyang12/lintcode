public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
        if (nums.length <= 1) {
            return;
        }

        int left, right;
        left = right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                ++left;
            }
            ++right;
        }
    }
}