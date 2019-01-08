/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: The first node of linked list.
     * @return: a tree node
     * 主要点在于找到中间节点，以及中间节点之前的节点，并将其下一个节点置为null
     */
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        TreeNode rootHead = new TreeNode(head.val);
        if (head.next == null) {
            return rootHead;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;
        ListNode prevNode = null;

        while (fastNode != null && fastNode.next != null) {
            prevNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        prevNode.next = null;
        TreeNode root = new TreeNode(slowNode.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slowNode.next);

        return root;
    }
}