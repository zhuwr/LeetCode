/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        int count = Count(head);
        int half = count>>1;
        if(count%2 == 1) {
            half++;
        }
        ListNode curt = head;
        for(int i=0; i<half; i++) {
            curt = curt.next;
        }
        ListNode rev = null;
        
        while(curt !=null) {
            ListNode temp = curt.next;
            curt.next = rev;
            rev = curt;
            curt = temp;
        }
        curt = head;
        while(rev != null) {
            if(rev.val != curt.val) {
                return false;
            }
            rev = rev.next;
            curt = curt.next;
        }
        return true;
    }
    
    public int Count(ListNode head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
