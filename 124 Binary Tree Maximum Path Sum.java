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
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        getSum(root);
        return result;
    }
    public int getSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        int value = root.val;
        if(leftSum > 0) {
            value += leftSum;
        }
        if(rightSum > 0) {
            value += rightSum;
        }
        result = Math.max(result, value);
        return Math.max(leftSum+root.val, Math.max(root.val, rightSum+root.val));
    }
}
