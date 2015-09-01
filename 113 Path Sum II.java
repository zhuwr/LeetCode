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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        
        find(root, sum, path, result);
        return result;
    }
    public void find(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            if(sum == root.val) {
                path.add(root.val);
                result.add(new ArrayList(path));
                path.remove(path.size()-1);
            }
        }
        path.add(root.val);
        find(root.left, sum - root.val, path, result);
        find(root.right, sum - root.val, path, result);
        path.remove(path.size()-1);
    }
}
