class Solution {
    public int reverse(int x) {

        int r=0;
        while(x!=0)
        {
            int d=x%10;
            if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && d>Integer.MAX_VALUE%10))
            return 0;
            if(r<Integer.MIN_VALUE/10 || (r==Integer.MAX_VALUE/10 && d<Integer.MIN_VALUE%10))
            return 0;
            r=(r*10)+d;
            x=x/10;
        }

        if(x<0)
        return -1*r;
        return r;
        
    }
}