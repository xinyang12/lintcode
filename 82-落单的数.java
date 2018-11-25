public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // for (int i = 0; i < A.length; ++i) {
        //     if (map.get(A[i]) != null) {
        //         map.put(A[i], map.get(A[i]) + 1);
        //     } else {
        //         map.put(A[i], 1);
        //     }
        // }
        
        // for (int i = 0; i < A.length; ++i) {
        //     if (map.get(A[i]) == 1) {
        //         return A[i];
        //     }
        // }
        
        // return 0;
        int x = 0;
        for (int i = 0; i < A.length; ++i) {
            x ^= A[i];
        }
        
        return x;
    }
}