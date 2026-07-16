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
    public ListNode mergeKLists(ListNode[] lists) {
        int listNumber = lists.length;
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (true) {
            int minIndex = -1;
            for (int i = 0; i< lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                } else if(minIndex == -1 || lists[i].val < lists[minIndex].val) minIndex = i;
            }

            if(minIndex == -1) {
                break;
            }
            current.next = new ListNode(lists[minIndex].val);
            current = current.next;

            lists[minIndex] = lists[minIndex].next;    
        }     
        return dummy.next;
    }
}
