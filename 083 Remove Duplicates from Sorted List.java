/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode curt = head;
        ListNode result = curt;
        while(curt.next != null) {
            if(curt.val == curt.next.val) {
                curt.next = curt.next.next;
            } else {
                curt = curt.next;
            }
            
        }
        return result;
    }
}
