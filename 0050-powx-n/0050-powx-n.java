class Solution {
    public double myPow(double x, int n) {
        
        /*
        long n1=n;
        n1=Math.abs(n1);
        
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) return 1 / myPow(x, -n);
        
        if (n % 2 == 0) 
            return myPow(x * x, n / 2);
        else 
            return x * myPow(x,n-1);
        */
        
        if (n == 0) {
            return 1;
        }
        
        if (n % 2 == 0) return myPow(x * x, n / 2);
        else if (n % 2 == 1) return x * myPow(x, n - 1);
        else return 1/myPow(x,-n);
        
    }
    
}

/*

BRUTE-FORCE

if(n==0)
        return 1;
        else
        {
            if(n<0)
            return 1/x*Math.pow(x,n+1);
            else
            return x*Math.pow(x,n-1);
        }
        
        */

/*
double ans=1.0;
        long n1=n;
        n1=Math.abs(n1);
        
        while(n1>0)
        {
            if(n1%2==0)
            {
                x=x*x;
                n1=n1/2;
            }
            else{
                ans=ans*x;
                n1=n1-1;
            }
        }
        if(n<0)
            return 1.0/ans;
        return ans;
        */