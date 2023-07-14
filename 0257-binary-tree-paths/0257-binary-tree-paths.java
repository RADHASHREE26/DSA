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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> al=new ArrayList<>();
        String s="";
        paths(root,al,s);
        
        return al;
        
    }
    
    public void paths(TreeNode node, List<String> al, String s)
    {
        if(node==null)
            return;
        s=s+node.val+"->";
        
        if(node.left==null && node.right==null)
        {
            s=s.substring(0,s.length()-2);
            al.add(s);
            return;
        }
        
        paths(node.left,al,s);
        paths(node.right,al,s);
        
    }
    
}