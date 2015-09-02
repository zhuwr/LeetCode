/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) {
            return;
        }
        TreeLinkNode parent = root;
        TreeLinkNode prev = root.left;
        TreeLinkNode curt = null;
        while(parent != null && prev != null) {
            curt = null;
            while(parent != null) {
                if(curt == null) {
                    curt = parent.left;
                } else {
                    curt.next = parent.left; 
                    curt = curt.next;
                }
                curt.next = parent.right;
                curt = curt.next;
                parent = parent.next;
            }
            parent = prev;
            prev = parent.left;
        }
    }
}
