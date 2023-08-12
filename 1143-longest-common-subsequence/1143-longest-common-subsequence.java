class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        
        for (int i = 0; i <= n; i++) dp[0][m] = 0;
        
        for (int i = 0; i <= m; i++) dp[n][0] = 0;
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                    if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                    else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return dp[text1.length()][text2.length()];
        
    }
}

/*

HashMap<Character, Integer> hs=new HashMap<>();
        
        int n1=text1.length();
        int n2=text2.length();
        int max=Math.max(n1,n2);
        int min=Math.min(n1,n2);
        
        for(int i=0;i<max;i++)
        {
            if(n1>i)
            {
                char c=text1.charAt(i);
                hs.put(c,hs.getOrDefault(c,0)+1);
            }
            if(n2>i)
            {
                char c=text2.charAt(i);
                hs.put(c,hs.getOrDefault(c,0)-1);
            }
        }
        
        int c=0;
        
        for (Map.Entry<Character,Integer> i : hs.entrySet()) {
            
            if(i.getValue()<0)
                c++;
            
        }
        
        return min-c;
        
        */