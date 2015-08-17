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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        if(root == null) {
            return ret;
        }
        TreeNode curt = root;
        while(curt!= null || !myStack.isEmpty()) {
            while(curt!= null) {
                myStack.push(curt);
                curt = curt.left;
            }
            curt = myStack.pop();
            ret.add(curt.val);
            curt = curt.right;
        }
        return ret;
    }
}
