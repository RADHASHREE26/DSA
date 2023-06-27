class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n==0)
            return false;
        double res=Math.log10(n)/Math.log10(3);
        if(res==Math.ceil(res))
            return true;
        else
            return false;
        
    }
}

/*

while(n%3==0 && n>=1)
        {
            n/=3;
        }
        if(n==1)
            return true;
        else
            return false;
            
            */

/*

int n1=31;
        while(Math.pow(2,31)<Math.pow(3,n1))
        {
            n1--;
        }
        
        if(n>0 && n1%n==0)
            return true;
        else
            return false;
            
            */