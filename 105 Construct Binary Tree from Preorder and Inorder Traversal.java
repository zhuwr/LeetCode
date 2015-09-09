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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = build(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
        return root;
    }
    public TreeNode build(int[] preorder, int[] inorder, int startpre, int endpre, int startin, int endin) {
        if(startpre > endpre || startin > endin) {
            return null;
        }
        if(startpre == endpre || startin == endin) {
            return new TreeNode(preorder[startpre]);
        }
        TreeNode root = new TreeNode(preorder[startpre]);
        int index = find(inorder, preorder[startpre]);
        int leftIndex = index - startin;
        int rightIndex = endin - index;
        root.left = build(preorder, inorder, startpre+1, startpre+leftIndex, startin, index-1);
        root.right = build(preorder, inorder, startpre+leftIndex+1, endpre, index+1, endin);
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
