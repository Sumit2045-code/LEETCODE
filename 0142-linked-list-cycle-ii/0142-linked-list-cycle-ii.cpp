class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* slow = head;
        ListNode* fast = head;
        bool flag = false;//no cycle detected
        while(fast!=NULL && fast->next!=NULL){
            slow = slow->next;
            fast = fast->next->next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(flag==false) return NULL;
        else{//ab hme pta hai ki cycle ya to detect hogi ya toh nhi lekin jb cycle detect hogi to hme pta krna hai ki starting point kidr hai to uske liye hm temp ko head se aur slow ko slow ke position se next next krna start krenge aur jha pe temp aur slow equal honge whi hoga apne cycle ka starting point to usse return kr denge.... 
            ListNode* temp = head;
            while(temp!=slow){
                slow = slow->next;
                temp = temp->next;
            }
            return temp;
        }  
    }
};