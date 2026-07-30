class Solution {
    public static void reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;
    //in dono for loops ne make sure kiya ki hmare 4 pointers bn jae
        for(int i=1;i<=left-1;i++){
            temp=temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        for(int i=1;i<=right-left+1;i++){
            temp=temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;

    // yha pe linkedlist ko break krte hai hm 
        tail1.next = null;
        tail2.next = null;
    // us part ko revrse kr diye 
        reverse(head2);
    // ab firse jod diye finally
        tail1.next=tail2;
        head2.next=head3;
    // return krdo dummy ka next 
        return dummy.next;
    }
}