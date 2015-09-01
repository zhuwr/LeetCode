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
    public int sumNumbers(TreeNode root) {
        return addNum(root, 0);
    }
    
    public int addNum(TreeNode root, int prev) {
        if(root == null) {
            return 0;
        }
        prev = prev*10 + root.val;
        if(root.left == null && root.right == null) {
            return prev;
        }
        return addNum(root.left, prev)+addNum(root.right, prev);
    }
}
