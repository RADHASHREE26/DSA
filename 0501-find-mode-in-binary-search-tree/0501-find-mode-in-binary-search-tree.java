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
    
    Integer prev=null;
    int c=1;
    int max=0;
    
    public int[] findMode(TreeNode root) {
        
        ArrayList<Integer> al=new ArrayList<>();
        traverse(root,al);
        int res[]=new int[al.size()];
        
        for(int i=0;i<al.size();i++)
        {
            res[i]=al.get(i);
        }
        
        return res;
        
    }
    
    public void traverse(TreeNode root, ArrayList<Integer> al)
    {
        if(root==null)
            return;
        
        traverse(root.left,al);
        
        if(prev!=null)
        {
            if(prev==root.val)
            {
                c++;
            }
            else
            {
                c=1;
            }
        }
        
        prev=root.val;
        
        if(c>max)
        {
            max=c;
            al.clear();
            al.add(root.val);
        }
        else if(c==max)
            al.add(root.val);
        
        traverse(root.right,al);
    }
    
}

/*

ArrayList<Integer> al=new ArrayList<>();
        allnodes(root,al);
        
        HashMap<Integer, Integer> hs=new HashMap<>();
        
        for(int i=0;i<al.size();i++)
        {
            hs.put(al.get(i),hs.getOrDefault(al.get(i),0)+1);
        }
        
        int max=Collections.max(hs.values());
        al.clear();
        for (Map.Entry<Integer, Integer> i : hs.entrySet()) {
            if (i.getValue() == max) {
                al.add(i.getKey());
            }
        }
        
        int res[]=new int[al.size()];
        
        for(int i=0;i<al.size();i++)
        {
            res[i]=al.get(i);
        }
        
        return res;
    }
    
    public void allnodes(TreeNode root,ArrayList<Integer> al)
    {
        if(root==null)
            return;
        
        al.add(root.val);
        allnodes(root.left, al);
        allnodes(root.right, al);
        
    }
    
    */