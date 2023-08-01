class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int c=1;
        int max=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                continue;
            else if(nums[i]+1==nums[i+1])
            {
                c++;
            }
            else
                c=1;
            max=Math.max(c,max);
        }
        
        return max ;
    }
}


/*

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int c=1;
        int max=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                continue;
            else if(nums[i]+1==nums[i+1])
            {
                c++;
            }
            else
                c=1;
            max=Math.max(c,max);
        }
        
        return max;
        
    }
}

*/

/*

if(nums.length==0)
            return 0;
        
        HashMap<Integer, Integer> hs=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        
        int max=1;
        int c=1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]) && hs.containsKey(nums[i]+1) && hs.get(nums[i])==1)
            {
                c++;
                hs.put(nums[i],hs.get(nums[i])-1);
            }
            else if(hs.containsKey(nums[i]) && hs.containsKey(nums[i]+1) && hs.get(nums[i])==2)
                hs.put(nums[i],hs.get(nums[i])-1);
            else
                c=1;
            max=Math.max(max,c);
        }
        
        return max;
        
        */