/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int countNodes(TreeNode* root,int count=0) {
        if(root ==NULL){
            return NULL;
        }
        if (root!=NULL){
            count=1;
        }
       count=count+ countNodes( root->left,count);
       count=count+ countNodes( root->right,count);
        return count;
    }
};