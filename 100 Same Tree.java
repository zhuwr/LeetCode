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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        boolean flag = false;
        if(p.val == q.val) {
            flag = same(p, q);
        }
        return flag||isSameTree(p.left,q)||isSameTree(p.right,q);
    }
    public boolean same(TreeNode p, TreeNode q) {
        if(q == null) {
            return true;
        }
        if(p == null || p.val != q.val) {
            return false;
        }
        return same(p.left,q.left)&&same(p.right,q.right);
    }
}
