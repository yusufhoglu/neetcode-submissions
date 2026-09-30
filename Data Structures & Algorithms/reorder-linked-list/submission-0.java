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
// [0, 1, 2, 3, 4, 5, 6]
// [0, n-x, x, n-(x-1), x+1, n -x-2, x+2] th
// [0, 6, 1, 5, 2, 4, 3]
class Solution {
    public void reorderList(ListNode head) {
        // Create a map that store <ListNode, Integer>
        List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        // traverse on the list  we can get lenght in here!
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        };
        temp = head;
        int length = values.size();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                // I need to put ith index.
                temp.val = values.get(i/2);
            } else {
                // I need to put lenght - i;
                temp.val = values.get(length - 1 - (i/2));
            }
            temp = temp.next;
        }
    }
}
