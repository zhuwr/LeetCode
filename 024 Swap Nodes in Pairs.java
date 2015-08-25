/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode curt = new ListNode(0);
        curt.next = head;
        ListNode ret = curt;
        while(curt.next != null && curt.next.next != null) {
            ListNode temp = curt.next;
            curt.next = curt.next.next;
            curt = curt.next;
            temp.next = curt.next;
            curt.next = temp;
            curt = curt.next;
        }
        return ret.next;
    }
}
