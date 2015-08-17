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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        List<Integer> ret = new ArrayList<Integer>();
        if(root == null) {
            return ret;
        }
        myStack.push(root);
        while(!myStack.isEmpty()) {
            TreeNode temp = myStack.pop();
            ret.add(temp.val);
            if(temp.right != null) {
                myStack.push(temp.right);
            }
            if(temp.left != null) {
                myStack.push(temp.left);
            }
        }
        return ret;
    }
}
