public class Solution {
    /**
     * @param nums: an integer array
     * @return: the maximum product
     * 这个题居然是排序，然后计算，我还以为有什么高端方法呢...
     */
    public int maximumProduct(int[] nums) {
        // Write your code here
        int length = nums.length;
        if (length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        
        Arrays.sort(nums);
        
        return Math.max(nums[0] * nums[1] * nums[length - 1], nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }
}