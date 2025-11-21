class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
         ListNode* tempA = headA;
         ListNode* tempB = headB;

        int lenA = 0;
         while(tempA!=NULL){
            lenA++;
            tempA = tempA->next;
         }
        int lenB = 0;
         while(tempB!=NULL){
            lenB++;
            tempB = tempB->next;
         }
         tempA = headA;//ab kyuki hme traverse bhi krna hai length find krne ke baad isliye hm wapis temp ko head pe lakr rkh denge 
         tempB = headB;//ab kyuki hme traverse bhi krna hai length find krne ke baad isliye hm wapis temp ko head pe lakr rkh denge
    if(lenA > lenB){
        int diff = lenA - lenB;
        for(int i = 1; i <= diff; i++){
            tempA = tempA->next;
        }
        while(tempA != tempB){
            tempA = tempA->next;
            tempB = tempB->next;
        }
        return tempA;
    }
    else{ // lenA <= lenB
        int diff = lenB - lenA;
        for(int i = 1; i <= diff; i++){
            tempB = tempB->next;
        }
        while(tempA != tempB){
            tempA = tempA->next;
            tempB = tempB->next;
        }
        return tempB;
    }
    }
};