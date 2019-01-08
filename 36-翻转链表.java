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
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        if (head == null || head.next == null || m == n) {
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode dummyMoveNode = dummyNode;
        int firstIndex = 1;
        int secondIndex = 1;
        while (dummyMoveNode.next != null && firstIndex < m) {
            ++firstIndex;
            dummyMoveNode = dummyMoveNode.next;
        }
        ListNode firstPrevNode = dummyMoveNode;
        ListNode firstNode = firstPrevNode.next;
        dummyMoveNode = dummyNode;
        while (dummyMoveNode.next != null && secondIndex < n) {
            ++secondIndex;
            dummyMoveNode = dummyMoveNode.next;
        }
        ListNode secondPrevNode = dummyMoveNode;
        ListNode secondNode = secondPrevNode.next;
        ListNode secondNextNode = secondNode.next;

        ListNode prev = secondNextNode;
        ListNode curr = firstNode;
        ListNode next = firstNode.next;

        while (next != secondNextNode) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;

        firstPrevNode.next = curr;

        return dummyNode.next;
    }
}