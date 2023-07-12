class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> al1=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            al1.add(nums[i]);
        }
        
        List<Integer> al2=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        
        helper(0, al1.size()-1, al1, al2, res);
        
        return res;
        
    }
    
    public void helper(int i, int j, List<Integer> al, List<Integer> ad, List<List<Integer>> res)
    {
        if(i==j+1)
        {
            res.add(new ArrayList<>(ad));
            return;
        }
        
        ad.add(al.get(i));
        helper(i+1,j,al,ad,res);
        ad.remove(ad.size()-1);
        helper(i+1,j,al,ad,res);
        return;
    }
    
}

/*

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ar.add(nums[i]);
        }
        List<Integer> al=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(0,ar,al,res,nums.length-1);
        //Collections.sort(res);
        return res;
    }
    public void helper(int i,List<Integer> a,List<Integer> l,List<List<Integer>> res,int k)
    {
        if(i==a.size())
        {
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(a.get(i));
        helper(i+1,a,l,res,k);
        l.remove(l.size()-1);
        helper(i+1,a,l,res,k);
        return;
    }
}

*/