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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> help = new LinkedList<TreeNode>();
        if(root == null) {
            return result;
        }
        help.offer(root);
        while(!help.isEmpty()) {
            int size = help.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(int i=0; i<size; i++) {
                TreeNode temp = help.poll();
                level.add(temp.val);
                if(temp.left != null) {
                    help.offer(temp.left);
                }
                if(temp.right != null) {
                    help.offer(temp.right);
                }
            }
            result.add(level.get(level.size()-1));
        }
        return result;
    }
}
