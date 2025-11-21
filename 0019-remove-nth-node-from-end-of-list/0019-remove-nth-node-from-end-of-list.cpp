class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
      int len = 0;
      ListNode* temp = head;
      while(temp!=NULL){
        len++;
        temp = temp->next;
      }
      if(n==len){//this is for handling the case jha pe hme jis node ko htana ho whi agr first node hua toh agr temp hi null hoga to temp ka next to error show krega isliye hme isse handle krna pdega 
        head = head->next;
        return head;
      } 
      int m = len-n+1;
      int idx = m-1;
      temp = head;
      for(int i=1;i<=idx-1;i++){
        temp = temp->next;
      } 
      temp->next = temp->next->next;
      return head;
    }
};