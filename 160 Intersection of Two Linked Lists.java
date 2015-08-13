/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = Count(headA);
        int countB = Count(headB);
        ListNode longOne = headA;
        ListNode shortOne = headB;
        int count = countA - countB;
        if(countA < countB) {
            longOne = headB;
            shortOne = headA;
            count = countB - countA;
        }
        for(int i=0; i<count; i++) {
            longOne = longOne.next;
        }
        while(longOne!=null) {
            if(longOne.val == shortOne.val) {
                return longOne;
            } else {
                longOne = longOne.next;
                shortOne = shortOne.next;
            }
        }
        
        return null;
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
