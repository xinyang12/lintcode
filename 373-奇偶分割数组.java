public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
        // int[] tmp = new int[nums.length];
        // int k = 0;
        
        // for (int i = 0; i < nums.length; ++i) {
        //     if (nums[i] % 2 == 1) {
        //         tmp[k++] = nums[i];
        //     }
        // }
        
        // k = nums.length - 1;
        // for (int i = nums.length - 1; i >= 0; --i) {
        //     if (nums[i] % 2 == 0) {
        //         tmp[k--] = nums[i];
        //     }
        // }
        
        // for (int i = 0; i < tmp.length; ++i) {
        //     nums[i] = tmp[i];
        // }
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            if (nums[low] % 2 == 1) {
                ++low;
            }
            if (nums[high] % 2 == 0) {
                --high;
            }
            
            if (low >= high) {
                break;
            }
            int tmp = nums[low];
            nums[low] = nums[high];
            nums[high] = tmp;
        }
    }
}