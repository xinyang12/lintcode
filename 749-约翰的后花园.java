public class Solution {
    /**
     * @param x: the wall's height
     * @return: YES or NO
     */
    // 递归版本
    public String isBuild(int x) {
        // write you code here
        if (x == 3 || x == 7) {
            return "YES";
        }
        if (x < 3) {
            return "NO";
        }

        return (isBuild(x - 3).equals("YES") || isBuild(x - 7).equals("YES")) ? "YES" : "NO";
    }

    // 非递归版本
    public String isBuild2(int x) {
        // write you code here
        boolean[] result = new boolean[x + 1];
        result[0] = true;
        for (int i = 3; i <= x; ++i) {
            if (result[i - 3]) {
                result[i] = true;
            }
        }

        for (int i = 7; i <= x; ++i) {
            if (result[i - 7]) {
                result[i] = true;
            }
        }

        return result[x] ? "YES" : "NO";
    }
}
