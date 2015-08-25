/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode curt = new ListNode(0);
        ListNode ret = curt;
        curt.next = head;
        while(curt.next != null) {
            if(curt.next.val == val) {
                curt.next = curt.next.next;
            } else {
                curt = curt.next;
            }
        }
        return ret.next;
    }
}
