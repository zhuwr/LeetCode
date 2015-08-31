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
        if(head == null || head.next == null) {
            return head;
        }
        ListNode curt = new ListNode(0);
        curt.next = head;
        ListNode result = curt;
        while(curt.next != null && curt.next.next !=null) {
            if(curt.next.val == curt.next.next.val) {
                int value = curt.next.val;
                while(curt.next != null && curt.next.val == value) {
                    curt.next = curt.next.next;
                }
            } else {
                curt = curt.next;
            }
        }
        return result.next;
    }
}
