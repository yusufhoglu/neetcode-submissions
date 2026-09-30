/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // travse to list until to nth
            // save the previous node to temp
        // remove the nth head = head.next; 
        List<ListNode> list = new ArrayList<>();
        ListNode tail = head;

        while(tail != null) {
            list.add(tail);
            tail = tail.next;
        }
        int nFromTheEnd = list.size() - n;
        if(nFromTheEnd == 0) {
            head = head.next;
            return head;
        }

        ListNode deletedNode = list.get(nFromTheEnd);
        ListNode prevNode = list.get(nFromTheEnd - 1);
        prevNode.next = deletedNode.next;

        return head;
    }  
}
