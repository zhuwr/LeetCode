/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return head;
        }
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smallHead = small;
        ListNode largeHead = large;
        while(head != null) {
            if(head.val < x) {
                small.next = new ListNode(head.val);
                small = small.next;
            } else {
                large.next = new ListNode(head.val);
                large = large.next;
            }
            head = head.next;
        }
        small.next = largeHead.next;
        return smallHead.next;
    }
}
