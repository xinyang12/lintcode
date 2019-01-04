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
     * @return: head of the linked list
     * 使用map
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmpHead = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (tmpHead != null) {
            if (map.get(tmpHead.val) != null) {
                map.put(tmpHead.val, map.get(tmpHead.val) + 1);
            } else {
                map.put(tmpHead.val, 1);
            }
            tmpHead = tmpHead.next;
        }

        ListNode dummyNode = new ListNode(0);
        ListNode resultNode = dummyNode;
        dummyNode.next = head;
        while (dummyNode != null) {
            while (dummyNode.next != null
                    && map.get(dummyNode.next.val) != null
                    && map.get(dummyNode.next.val) > 1) {
                dummyNode.next = dummyNode.next.next;
            }
            dummyNode = dummyNode.next;
        }

        return resultNode.next;
    }

    // 使用O(1)额外空间
    public ListNode deleteDuplicates2(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        ListNode resultNode = dummyNode;
        dummyNode.next = head;
        ListNode dupNode = null;
        while (dummyNode.next != null) {
            if (dummyNode.next.next != null && dummyNode.next.val == dummyNode.next.next.val) {
                dupNode = dummyNode.next;
                dummyNode.next = dummyNode.next.next;
            } else if (dupNode != null && dummyNode.next.val == dupNode.val) {
                dummyNode.next = dummyNode.next.next;
            } else {
                dummyNode = dummyNode.next;
            }
        }

        return resultNode.next;
    }
}