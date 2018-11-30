public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 1;
        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            } else if (nums[i] != nums[index - 1]) {
                nums[++index] = nums[i];
            }
        }

        return index + 1;
    }
}
