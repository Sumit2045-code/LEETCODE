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
        ListNode dummy = new ListNode();
        dummy.next = head; 
        ListNode slow = dummy;
        ListNode fast = dummy;
        // fast ko k steps aage le jao
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        // ab dono ko saath me chalao
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //remove nth node from end
        slow.next = slow.next.next;
        return dummy.next;
    }
}