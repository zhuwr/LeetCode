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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) {
            return result;
        }
        int count = 0;
        Queue<TreeNode> help = new LinkedList<TreeNode>();
        help.offer(root);
        while(!help.isEmpty()) {
            int size = help.size();
            List<Integer> level = new ArrayList<Integer>();
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
            if(count == 0) {
                count =1;
            } else {
                Collections.reverse(level);
                count = 0;
            }
            result.add(level);
        }
        return result;
    }
}
