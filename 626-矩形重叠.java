/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

public class Solution {
    /**
     * @param l1: top-left coordinate of first rectangle
     * @param r1: bottom-right coordinate of first rectangle
     * @param l2: top-left coordinate of second rectangle
     * @param r2: bottom-right coordinate of second rectangle
     * @return: true if they are overlap or false
     */
    public boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        // write your code here
        // 排除不合格的矩形坐标
        if (r1.x <= l1.x || r1.y >= l1.y || r2.x <= l2.x || r2.y >= l2.y) {
            return false;
        }
        // 排除四种不可能重叠的情形，剩下情形就都是重叠的
        if (l2.x > r1.x || r2.x < l1.x || r2.y > l1.y || l2.y < r1.y) {
            return false;
        }
        
        return true;
    }
}