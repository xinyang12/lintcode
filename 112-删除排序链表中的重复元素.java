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
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode resultNode = head;
        while (head.next != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return resultNode;
    }
}