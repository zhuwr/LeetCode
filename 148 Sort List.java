/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode left = new ListNode(0), leftHead = left;
        ListNode middle = new ListNode(0), middleHead = middle;
        ListNode right = new ListNode(0), rightHead = right;
        int value = head.val;
        while(head != null) {
            if(head.val < value) {
                left.next = new ListNode(head.val);
                left = left.next;
            } else if(head.val > value) {
                right.next = new ListNode(head.val);
                right = right.next;
            } else {
                middle.next = new ListNode(head.val);
                middle = middle.next;
            }
            head = head.next;
        }
        ListNode sortLeft = sortList(leftHead.next);
        ListNode sortRight = sortList(rightHead.next);
        ListNode result = connect(sortLeft, middleHead.next, sortRight);
        return result;
    }
    public ListNode connect(ListNode left, ListNode middle, ListNode right) {
        ListNode curt = new ListNode(0), ret = curt;
        ListNode leftTail = left, rightTail = right, middleTail = middle;
        if(left != null) {
            curt.next = left;
            while(leftTail.next != null) {
                leftTail = leftTail.next;
            }
            leftTail.next = middle;
        } else {
            curt.next = middle;
        }
        while(middleTail.next != null) {
            middleTail = middleTail.next;
        }
        middleTail.next = right;
        return ret.next;
    }
}
