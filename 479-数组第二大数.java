public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        int max = nums[0];
        int secMax = nums[1];
        
        if (max < secMax) {
            int t = max;
            max = secMax;
            secMax = t;
        }
        
        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] >= max) {
                secMax = max;
                max = nums[i];
            } else if (nums[i] <= max && nums[i] >= secMax) {
                secMax = nums[i];
            }
        }
        
        return secMax;
    }
}