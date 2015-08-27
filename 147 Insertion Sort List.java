/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode result = new ListNode(Integer.MIN_VALUE);
        while(head != null) {
            ListNode curt = result;
            while(curt.next != null && curt.next.val< head.val) {
                curt = curt.next;
            }
            ListNode temp = head.next;
            head.next = curt.next;
            curt.next = head;
            head = temp;
        }
        return result.next;
        
    }
}
