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
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr, prev, next;
        curr = next = head;
        prev = null;
        while (next.next != null) {
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        curr.next = prev;
        return curr;
    }
}