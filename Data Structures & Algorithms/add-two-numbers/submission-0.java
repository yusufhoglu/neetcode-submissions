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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // travse on the list unless both of them not null
        // carry if needed 
            // if the sum + carry > 9 add the least to carry
        int sum = 0;
        int carry = 0;
        ListNode resultNode = new ListNode(0);
        ListNode curr = resultNode;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            sum = v1 + v2 + carry;
            if(sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }      
       
            curr.next = new ListNode(sum);
            curr = curr.next;            

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return resultNode.next;
    }
}
