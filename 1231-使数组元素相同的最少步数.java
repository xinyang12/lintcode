public class Solution {
    /**
     * @param nums: an array
     * @return: the minimum number of moves required to make all array elements equal
     */
    public int minMoves(int[] nums) {
        // Write your code here
        if (nums.length == 0) {
            return 0;
        }
        
        int min = nums[0];
        
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > min) {
                count += nums[i] - min;
            }
        }
        
        return count;
    }
}