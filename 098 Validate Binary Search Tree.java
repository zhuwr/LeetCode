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
    List<Integer> tree = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        inOrder(root);
        for(int i=0; i<tree.size()-1; i++) {
            if(tree.get(i) >= tree.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        tree.add(root.val);
        inOrder(root.right);
    }
}
