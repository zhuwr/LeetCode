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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root == null) {
            return result;
        }
        find(root, String.valueOf(root.val), result);
        return result;
    }
    public void find(TreeNode root, String path, List<String> result) {
        if(root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        if(root.left != null) {
            find(root.left, path + "->" + root.left.val, result);
        }
        if(root.right != null) {
            find(root.right, path + "->" + root.right.val, result);
        }
    }
}
