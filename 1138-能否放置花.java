public class Solution {
    /**
     * @param flowerbed: an array
     * @param n: an Integer
     * @return: if n new flowers can be planted in it without violating the no-adjacent-flowers rule
     * 考虑000的情况，如果两边都是边界，那么就能种两朵花，如果不是边界，那么就要看两边的情况
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Write your code here
        if (flowerbed.length == 0 || n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; ++i) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0 ? 0 : flowerbed[i - 1]);
                int next = (i == flowerbed.length - 1 ? 0 : flowerbed[i + 1]);
                if (prev + next == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}
