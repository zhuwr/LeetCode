/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        if((root.left == null && root.right != null)|| (root.left !=null && root.right == null) ) {
            return false;
        }
        return sym(root.left, root.right);
    }
    public boolean sym(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if((left == null && right != null)||(left !=null && right == null)||(left.val != right.val)) {
            return false;
        }
        return sym(left.left,right.right)&&sym(left.right, right.left);
    }
}
