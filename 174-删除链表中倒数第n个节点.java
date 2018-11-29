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
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if (head == null || n == 0) {
            return head;
        }
        int length = listLength(head);
        if (length < n) {
            return head;
        }
        int m = length - n + 1;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode resultNode = dummyNode;
        int count = 1;
        while (count != m) {
            dummyNode = dummyNode.next;
            ++count;
        }
        dummyNode.next = dummyNode.next.next;
        
        return resultNode.next;
    }
    
    public int listLength(ListNode head) {
        int count = 0;
        while (head != null) {
            ++count;
            head = head.next;
        }
        return count;
    }
}