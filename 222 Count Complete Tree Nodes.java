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
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = getLeft(root.left);
        int right = getRight(root.right);
        if(left == right) {
            return (2<<left) - 1;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
    public int getLeft(TreeNode root) {
        int count = 0;
        while(root != null) {
            root = root.left;
            count++;
        }
        return count;
    }
    public int getRight(TreeNode root) {
        int count = 0;
        while(root != null) {
            root = root.right;
            count++;
        }
        return count;
    }
}
