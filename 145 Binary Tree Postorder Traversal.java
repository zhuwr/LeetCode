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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        postOrder(root,result);
        return result;
    }
    
    public void postOrder(TreeNode root, ArrayList<Integer> result) {
        if(root == null) {
            return;
        }
        postOrder(root.left,result);
        postOrder(root.right,result);
        result.add(root.val);
    }
}
