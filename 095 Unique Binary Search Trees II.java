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
    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }
    public List<TreeNode> generate(int start, int end) {
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(start > end) {
            result.add(null);
            return result;
        }
        for(int i=start; i<=end; i++) {
            List<TreeNode> left = generate(start, i-1);
            List<TreeNode> right = generate(i+1, end);
            for(TreeNode l:left) {
                for(TreeNode r:right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
