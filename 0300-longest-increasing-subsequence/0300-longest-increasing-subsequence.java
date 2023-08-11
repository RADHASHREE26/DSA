class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        dp[0] = 1;
        int ans = 1;
        
        for (int i = 1; i < dp.length; i++) {
            
            int max = 0;
            
            for (int j = 0; j < i; j++) {
                
                if (nums[j] < nums[i]) {
                    if(dp[j] > max) {
                        
                        max = dp[j];
                        
                    }
                }
                
            }
            
            dp[i] = max + 1;
            
            if (dp[i] > ans) ans = dp[i];
            
        }
        
        return ans;

        
        
        
    }
    
}

/*

Bottom up tabulation

int n=nums.length;
        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i], 0);
        }
        
        for(int curr=n-1;curr>=0;curr--)
        {
            for(int prev=curr-1;prev>=-1;prev--)
            {
                //take
                int take=0;
                if(prev==-1 || nums[curr]>nums[prev])
                    take=1+dp[curr+1][curr+1];
        
                //not take
                int notTake=0+dp[curr+1][prev+1];
                
                dp[curr][prev+1]=Math.max(take, notTake);
            }
        }
        
        return dp[0][0];
        
        */

/*

TLE (Memoization approach)

class Solution {
    public int lengthOfLIS(int[] nums) {
        
        return helper(nums, nums.length, 0, -1);
        
    }
    
    public int helper(int[] nums, int n, int curr, int prev)
    {
        if(curr==n)
            return 0;
        
        //take
        int take=0;
        if(prev==-1 || nums[curr]>nums[prev])
            take=1+helper(nums, n, curr+1, curr);
        
        //not take
        int notTake=0+helper(nums, n, curr+1, prev);
        
        return Math.max(take, notTake);
        
        
    }
    
}

*/