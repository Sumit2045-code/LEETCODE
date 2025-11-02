class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        if(slow ==null || slow.next== null) return head;
        int count =0;
        while(slow != null){
            count ++;
            slow= slow.next;
        }
        slow= head;
        int rotations = k% count;
        if(rotations ==0) return head;
        for(int i=1; i<=rotations; i++){
            fast= fast.next;
        }
        while(fast.next!= null){
            slow= slow.next;
            fast= fast.next;
        }
        ListNode h = slow.next;
        slow.next= null;
        fast.next= head;
        return h;
    }
}