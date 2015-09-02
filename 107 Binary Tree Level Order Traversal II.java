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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> level = new LinkedList<TreeNode>();
        if(root == null) {
            return result;
        }
        level.offer(root);
        while(level.size()>0) {
            int size = level.size();
            List<Integer> help = new ArrayList<Integer>();
            for(int i=0; i<size; i++) {
                TreeNode temp = level.poll();
                help.add(temp.val);
                if(temp.left != null) {
                    level.offer(temp.left);
                }
                if(temp.right != null) {
                    level.offer(temp.right);
                }
            }
            result.add(0, help);
        }
        return result;
    }
}
