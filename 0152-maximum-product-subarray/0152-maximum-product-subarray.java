class Solution {
    public int maxProduct(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int prefix=1, suffix=1;
        
        for(int i=0;i<n;i++)
        {

            if(prefix==0)
            {
                prefix=1;
            }
            if(suffix==0)
            {
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        
        return max;
        
    }
}

/*

int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pre=1,suf=1;
        for(int i=0;i<n;i++)
        {
            if(pre==0)
            pre=1;
            if(suf==0)
            suf=1;
            pre=pre*nums[i];
            suf=suf*nums[n-i-1];
            max=Math.max(max,Math.max(pre,suf));
        }
        return max;
        
        */