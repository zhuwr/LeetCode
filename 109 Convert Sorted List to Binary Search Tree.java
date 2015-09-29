/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        int size = getLength(head);
        return build(head, size);
    }
    public TreeNode build(ListNode head, int size) {
        if(size == 0 || head == null) {
            return null;
        }
        ListNode curt = head;
        for(int i=0; i<size/2; i++) {
            curt = curt.next;
        }
        TreeNode root = new TreeNode(curt.val);
        root.left = build(head, size/2);
        root.right = build(curt.next, size-size/2-1);
        return root;
        
    }
    public int getLength(ListNode head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
