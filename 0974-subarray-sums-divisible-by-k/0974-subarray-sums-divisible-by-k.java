class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
        int sum=0;
        int res=0;
        int rem=0;
        
        HashMap<Integer, Integer> hs=new HashMap<>();
        hs.put(0,1);
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            
            rem=sum%k;
            if(rem<0)
                rem=rem+k;
            
            if(hs.containsKey(rem))
                res+=hs.get(rem);
            
            hs.put(rem,hs.getOrDefault(rem,0)+1);
            
        }
        
        return res;
        
    }
}