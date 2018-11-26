/**
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
    /**
     * @param root: t
     * @return: the sum of all left leaves
     */
    public int sumOfLeftLeaves(TreeNode root) {
        // Write your code here
        if (root == null) {
            return 0;
        }
        
        int count = 0;
        if (isLeaf(root.left)) {
            count += root.left.val;
        } else {
            count += sumOfLeftLeaves(root.left);
        }
        
        count += sumOfLeftLeaves(root.right);
        
        return count;
    }
    
    public boolean isLeaf(TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
}