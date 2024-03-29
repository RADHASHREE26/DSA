/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length==0)
            return null;
        return helper(nums,0,nums.length-1);
        
    }
    
    public TreeNode helper(int arr[], int l, int r)
    {
        if(l<=r)
        {
            int mid=l+(r-l)/2;
            TreeNode n=new TreeNode(arr[mid]);
            n.left=helper(arr,l,mid-1);
            n.right = helper(arr,mid+1,r);
            return n;
        }
        return null;
    }
    
}
