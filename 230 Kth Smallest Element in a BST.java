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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode curt = root;
        int count = 0;
        while(curt != null || !myStack.isEmpty() ) {
            while(curt != null) {
                myStack.push(curt);
                curt = curt.left;
            }
            count++;
            curt = myStack.peek();
            myStack.pop();
            if(count == k) {
                return curt.val;
            }
            curt = curt.right;
        }
        return -1;
    }
}
