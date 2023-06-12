class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        
        int a=0;
        int b=s.length()-1;
        
        
        
        while(a<=b)
        {
            if(!((s.charAt(a)>=97 && s.charAt(a)<=122) || (s.charAt(a)>=48 && s.charAt(a)<=57)))
            {
                a++;
                continue;
            }
            else if(!((s.charAt(b)>=97 && s.charAt(b)<=122) || (s.charAt(b)>=48 && s.charAt(b)<=57)))
            {
                b--;
                continue;
            }
            else
            {
                if(s.charAt(a)!=s.charAt(b))
                return false;
            }
            a++;
            b--;
        }
        return true;
        
    }
}

/*
        String n="";
        String n2="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            int a=(int)(s.charAt(i));
            if((a>=97 && a<=122) || (a>=48 && a<=57))
            {
            n=n+s.charAt(i);
            n2=s.charAt(i)+n2;
            }
        }
        if(n.equals(n2))
        return true;
        else
        return false;
        */

/*
        s=s.toLowerCase();
        
        int a=0;
        int b=s.length()-1;
        
        
        
        while(a<=b)
        {
            if(!((s.charAt(a)>=90 && s.charAt(a)<=122) || (s.charAt(a)>=48 && s.charAt(a)<=57)))
            {
                a++;
                continue;
            }
            else if(!((s.charAt(b)>=90 && s.charAt(b)<=122) || (s.charAt(b)>=48 && s.charAt(b)<=57)))
            {
                b--;
                continue;
            }
            else
            {
                if(s.charAt(a)!=s.charAt(b))
                return false;
            }
            a++;
            b--;
        }
        return true;
        */