/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: A ListNode.
     * @return: A boolean.
     */
    public boolean isPalindrome(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return true;
        }
        ListNode tmpNode = head;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (tmpNode != null) {
            if (tmpNode.val != stack.pop()) {
                return false;
            }
            tmpNode = tmpNode.next;
        }
        
        return true;
    }
}