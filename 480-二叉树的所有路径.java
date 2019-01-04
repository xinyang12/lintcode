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
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        if (root == null) {
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        List<String> resultList = new ArrayList<>();

        findBinaryPath(root, resultList, sb);

        return resultList;
    }
    
    private void findBinaryPath(TreeNode root, List<String> resultList, StringBuilder sb) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (sb.length() != 0) {
                sb.append("->");
            }
            sb.append(root.val);
            resultList.add(sb.toString());
            return;
        }
        if (root.left != null) {
            StringBuilder leftSb = new StringBuilder(sb);
            if (leftSb.length() != 0) {
                leftSb.append("->");
            }
            leftSb.append(root.val);
            findBinaryPath(root.left, resultList, leftSb);
        }
        if (root.right != null) {
            StringBuilder rightSb = new StringBuilder(sb);
            if (rightSb.length() != 0) {
                rightSb.append("->");
            }
            rightSb.append(root.val);
            findBinaryPath(root.right, resultList, rightSb);
        }
    }
}