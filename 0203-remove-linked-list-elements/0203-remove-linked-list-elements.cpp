/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        while(head!=NULL){
            if(head->val==val){
            head=head->next;
            }else{
                break;
            }
        }
        ListNode* p = head;
        if (p == NULL) {
            return head;
        }
        ListNode* temp = head;
        temp = temp->next;

        while (temp != NULL) {
            if (temp->val == val) {
                p->next = temp->next;
                temp = p->next;
            } else {
                p = p->next;
                temp = temp->next;
            }
        }
        if(head->val==val){
            return NULL;
        }

        return head;
    }
};