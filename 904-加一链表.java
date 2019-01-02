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
     * @param head: the first Node
     * @return: the answer after plus one
     */
    public ListNode plusOne(ListNode head) {
        // Write your code here
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode tail = null;
        int lastValue = 0;
        int nowValue;
        int i = 0;
        while (!stack.isEmpty()) {
            nowValue = stack.pop();
            ++i;
            ListNode node;
            if (i == 1) {
                node = new ListNode((nowValue + 1 + lastValue) % 10);
                lastValue = (nowValue + lastValue + 1) / 10;
            } else {
                node = new ListNode((nowValue + lastValue) % 10);
                lastValue = (nowValue + lastValue) / 10;
            }
            node.next = tail;
            tail = node;
        }

        if (lastValue > 0) {
            ListNode newHead = new ListNode(lastValue);
            newHead.next = tail;
            return newHead;
        }

        return tail;
    }
}