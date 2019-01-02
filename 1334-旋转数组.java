public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        // Write your code here
        k %= nums.length;
        if (k == 0 || nums.length == 1) {
            return nums;
        }
        int length = nums.length;

        rotateArray(nums, 0, length - 1 - k);
        rotateArray(nums, length - k, nums.length - 1);
        rotateArray(nums, 0, nums.length - 1);

        return nums;
    }

    private void rotateArray(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            ++start;
            --end;
        }
    }
}