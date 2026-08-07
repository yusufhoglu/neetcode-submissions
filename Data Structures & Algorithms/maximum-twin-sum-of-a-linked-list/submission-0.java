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
    public int pairSum(ListNode head) {
        int L = 0, R = 0;
        List<Integer> arr = new ArrayList<>();
        while(head!=null) {
            arr.add(head.val);
            head = head.next;
        }
        R = arr.size()-1;
        int max = Integer.MIN_VALUE;
        while (L < R) {
            int sum = arr.get(L++) + arr.get(R--);
            max = Math.max(max, sum);
        }   
        return max;
    }
}