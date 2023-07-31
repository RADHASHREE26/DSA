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
    public int findSecondMinimumValue(TreeNode root) {
        
        if(root==null || (root.left==null && root.right==null))
           return -1;
           
        HashSet<Integer> al=new HashSet<>();
        helper(root, al);
        List<Integer> list = new ArrayList<Integer>(al);
        Collections.sort(list);

           if(list.size()==1)
           return -1;
           else
           return (int)(list.get(1));
           
        
    }
           
    public void helper(TreeNode root, HashSet<Integer> al)
    {
        if(root==null)
            return;
        al.add(root.val);
        helper(root.left, al);
        helper(root.right, al);
        return;
    }
           
}