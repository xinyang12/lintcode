public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (sum <= 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            
            if (max < sum) {
                max = sum;
            }
        }
        
        return max;
    }
}