/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }
        int length = getLength(head);
        k = k% length;
        if(k == 0) {
            return head;
        }
        ListNode curt = head;
        for(int i=1; i<length-k; i++) {
            curt = curt.next;
        }
        ListNode end = curt;
        while(end.next != null) {
            end = end.next;
        }
        end.next = head;
        ListNode result = curt.next;
        curt.next = null;
        return result;
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
