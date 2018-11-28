public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums.size() == 1) {
            return nums.get(0);
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); ++i) {
            if (sum >= 0) {
                sum = nums.get(i);
            } else {
                sum += nums.get(i);
            }

            if (sum < min) {
                min = sum;
            }
        }

        return min;
    }
}