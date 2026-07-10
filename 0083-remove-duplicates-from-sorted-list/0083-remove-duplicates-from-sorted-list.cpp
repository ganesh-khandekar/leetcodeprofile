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
    void update(ListNode* p) {
        if (p != NULL) {
            while ((p->next != NULL) && (p->val == p->next->val)) {
                p->next = p->next->next;
            }
        
        p = p->next;
        }
        if (p != NULL) {
            update(p);
        }
    }
    ListNode* deleteDuplicates(ListNode* head) {
        update(head);
        return head;
    }
};