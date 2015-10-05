/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode mid = getMid(head);
        ListNode rev = reverse(mid.next);
        mid.next = null;
        ListNode curt1 = head, curt2 = rev, curt = new ListNode(0);
        while(curt1 != null && curt2 != null) {
            curt.next = curt1;
            curt = curt.next;
            curt1 = curt1.next;
            curt.next = curt2;
            curt = curt.next;
            curt2 = curt2.next;
        }
        if(curt1 != null) {
            curt.next = curt1;
        }
        
    }
    public ListNode reverse(ListNode head) {
        ListNode ret = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = ret;
            ret = head;
            head = temp;
        }
        return ret;
    }
    public ListNode getMid(ListNode head) {
        ListNode fast = head.next, slow = head;
        while(fast!= null&&fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
