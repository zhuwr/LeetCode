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
    public TreeNode last = null;
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        if(last != null) {
            last.left = null;
            last.right = root;
        }
        TreeNode right = root.right;
        last = root;
        flatten(root.left);
        flatten(right);
        
    }
}
