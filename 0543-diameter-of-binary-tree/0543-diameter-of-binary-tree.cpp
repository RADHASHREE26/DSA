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
    int diameterOfBinaryTree(TreeNode* root) {
        
        if(root==NULL)
            return 0;
        int dia_left=diameterOfBinaryTree(root->left);
        int dia_right=diameterOfBinaryTree(root->right);
        
        int left_height=height(root->left);
        int right_height=height(root->right);
        
        int d=left_height+right_height;
        
        return max(d,max(dia_left,dia_right));
        
    }
    
    int height(TreeNode* root)
    {
        if(root==NULL)
            return 0;
        return 1+max(height(root->left),height(root->right));
    }
    
};
