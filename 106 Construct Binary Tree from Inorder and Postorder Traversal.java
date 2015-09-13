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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0) {
            return null;
        }
        return build(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
    public TreeNode build(int[] inorder, int[] postorder, int startin, int endin, int startpost, int endpost) {
        if(startin > endin) {
            return null;
        }
        if(startin == endin) {
            return new TreeNode(inorder[startin]);
        }
        TreeNode root = new TreeNode(postorder[endpost]);
        int index = find(inorder, postorder[endpost]);
        int length = index - startin-1;
        root.left = build(inorder, postorder, startin, index-1, startpost, startpost+length);
        root.right = build(inorder, postorder, index+1, endin, startpost+length+1, endpost-1);
        return root;
    }
    public int find(int[] inorder, int target) {
        for(int i=0; i<inorder.length; i++) {
            if(inorder[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
