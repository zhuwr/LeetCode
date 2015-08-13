/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m == n) {
            return head;
        }
        ListNode ret = new ListNode(0);
        ret.next = head;
        head = ret;
        for(int i=1; i<m; i++) {
            head = head.next;
            n--;
        }
        ListNode left = head;
        ListNode reverse = head.next;
        head = head.next;
        ListNode mid = reverse;
        while(n>0) {
            ListNode temp = head.next;
            head.next = reverse;
            reverse = head;
            head = temp;
            n--;
        }
        left.next = reverse;
        mid.next = head;
        return ret.next;
    }
}
