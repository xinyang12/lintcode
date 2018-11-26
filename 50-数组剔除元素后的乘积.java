public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); ++i) {
            long answer = 1;
            for (int j = 0; j < nums.size(); ++j) {
                if (i == j) {
                    continue;
                }
                answer *= nums.get(j);
            }
            result.add(answer);
        }
        
        return result;
    }
}