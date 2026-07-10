/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    vector<int> tarversel(TreeNode* root, vector<int>& p) {
        if (root == NULL) {
            return p;
        }
        p.push_back(root->val);
        tarversel(root->left, p);
        tarversel(root->right, p);
        return p;
    }
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> p;
        if (root == NULL) {
            return p;
        }
        p.push_back(root->val);
        tarversel(root->left, p);
        tarversel(root->right, p);
        return p;
    }
};