/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    private TreeNode curt;
    public BSTIterator(TreeNode root) {
        while(!stack.isEmpty()) {
            stack.pop();
        }
        curt = root;
    }
   
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (curt != null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        while (curt != null) {
            stack.push(curt);
            curt = curt.left;
        }
        curt = stack.peek(); 
        stack.pop();
        int val = curt.val;
        curt = curt.right;
        return val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
