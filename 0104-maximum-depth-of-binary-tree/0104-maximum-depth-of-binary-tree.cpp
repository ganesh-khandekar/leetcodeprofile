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
    int maxDepth1(TreeNode* root, int sum, int &max) {

        if (root == NULL) {
            return sum;
        }
        sum++;
        if (sum > max) {
            max = sum;
        }
        sum= maxDepth1(root->left, sum, max);
        sum= maxDepth1(root->right, sum, max);
        
        return --sum;
    }
    int maxDepth(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }
        int max = 0, sum = 0;

         maxDepth1(root, sum, max);
        return max;
    }
};