public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length <= 1) {
            return nums.length;
        }
        int index = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}
