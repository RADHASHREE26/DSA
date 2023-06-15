class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        while(!hs.contains(n))
        {
            hs.add(n);
            n=sum_of_sq(n);
            if(n==1)
                return true;
        }
        return false;
        
    }
    
    public int sum_of_sq(int n)
    {
        int res=0;
        while(n>0)
        {
            int d=n%10;
            res=res+(d*d);
            n=n/10;
        }
        
        return res;
    }
}