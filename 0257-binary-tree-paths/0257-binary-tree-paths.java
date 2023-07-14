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

/*

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

*/

/*

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans = new ArrayList<>();
        
        helper (root, "", ans);
        
        return ans;
        
    }
    
    public void helper (TreeNode root, String sub, List<String> ans) {
        
        if (root.left == null && root.right == null) {
            sub=sub+root.val;
            ans.add(sub);
        }
        if(root.left!=null)
            helper (root.left, sub+root.val+"->", ans);
        
        if(root.right != null)
            helper (root.right, sub+root.val+"->", ans);
    }
}
*/