/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode result = null;
        
        while(head !=null) {
            ListNode temp = head.next;
            head.next = result;
            result = head;
            head = temp;
            
        }
        return result;
    }
}
