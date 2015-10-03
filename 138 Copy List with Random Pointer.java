/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) {
            return head;
        }
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode ret = new RandomListNode(0), curt = ret;
        while(head != null) {
            RandomListNode temp;
            if(map.containsKey(head)) {
                temp = map.get(head);
            } else {
                temp = new RandomListNode(head.label);
                map.put(head, temp);
            }
            curt.next = temp;
            if(head.random != null) {
                if(map.containsKey(head.random)) {
                    temp.random = map.get(head.random);
                } else {
                    temp.random = new RandomListNode(head.random.label);
                    map.put(head.random, temp.random);
                }
            }

            head = head.next;
            curt = curt.next;
        }
        return ret.next;
    }
}
