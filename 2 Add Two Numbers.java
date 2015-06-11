Medium
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ret = head;
        int sum = 0;
        int flag = 0;
        while(l1 != null && l2 !=null) {
            sum = l1.val + l2.val + flag;
            head.next = new ListNode(sum%10);
            flag = sum/10;
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null) {
            sum = l1.val + flag;
            flag = sum/10;
            head.next = new ListNode(sum%10);
            head = head.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            sum = l2.val + flag;
            flag = sum/10;
            head.next = new ListNode(sum%10);
            head = head.next;
            l2 = l2.next;
        }
        if(flag != 0) {
            head.next = new ListNode(flag); 
        }
        
        return ret.next;
        
    }
}
