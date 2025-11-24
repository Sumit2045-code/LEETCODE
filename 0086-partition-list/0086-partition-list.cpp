class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode* lo = new ListNode(100);
        ListNode* hi = new ListNode(234);
        ListNode* tempLo = lo ;
        ListNode* tempHi = hi ;
        ListNode* temp = head ;
        while(temp!=NULL){
            if(temp->val<x){
                tempLo->next = temp;
                temp = temp->next;
                tempLo = tempLo->next;
            }
            else{//temp->val >=x
                tempHi->next = temp;
                temp = temp->next;
                tempHi = tempHi->next;
            }
        }
        tempLo->next = hi->next;//to connect the lower partition with the higher list 
        tempHi->next = NULL;// after all partition of low and high and after combination of low list with high in serires the temphi must have address of null to make the ll complete 
        return lo->next ;//this will return the complete list in order of the question asked 
    }
};