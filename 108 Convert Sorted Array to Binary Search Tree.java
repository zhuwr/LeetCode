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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        return build(nums, 0, nums.length-1);
    }
    public TreeNode build(int[] nums, int start, int end) {
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        if(start == end) {
            return root;
        }
        if(start > end) {
            return null;
        }
        root.left = build(nums, start, mid-1);
        root.right = build(nums, mid+1, end);
        return root;
    }
}
