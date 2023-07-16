class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> al =new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        
        helper(0,nums,al, res);
        
        return res;
        
    }
    
    public void helper(int i, int[] nums, List<Integer> al, List<List<Integer>> res)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(al));
            return;
        }
        else
        {
            for(int j=0;j<=al.size();j++)
            {
                al.add(j,nums[i]);
                helper(i+1,nums,al,res);
                al.remove(j);
            }
        }
        
    }
    
}

/*

public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        helper(nums,0,res,al);
        return res;
    }

    public void helper(int nums[],int i, List<List<Integer>> res,List<Integer> al)
    {
        if(i == nums.length) {
            res.add(new ArrayList<>(al));
            return;
        }

        for (int j = 0; j <= al.size(); j++) {
            al.add(j, nums[i]);
            helper(nums, i + 1, res, al);
            al.remove(j);
        }

        return;
        
        */

/*

List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        helper(nums,0,res,al);
        return res;
    }

    public void helper(int nums[],int i, List<List<Integer>> res,List<Integer> al)
    {
        if(i == nums.length) {
            res.add(new ArrayList<>(al));
            return;
        }

        for (int j = 0; j <= al.size(); j++) {
            al.add(j, nums[i]);
            helper(nums, i + 1, res, al);
            al.remove(j);
        }

        return;
        
        */