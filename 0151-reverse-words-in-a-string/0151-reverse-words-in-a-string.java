class Solution {
    public String reverseWords(String s) {
        
        s=" "+s;
        
        String res="";
        String w="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
                w=s.charAt(i)+w;
            else
            {
                if(w!="")
                {
                    res=res+w+" ";
                    w="";
                }
            }
        }
        
        return res.trim();

    }
}

/*
        s=" "+s;
        String res="";
        String w="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            w=s.charAt(i)+w;
            else
            {
                if(w!="")
                {
                    res=res+w+" ";
                    w="";
                }
            }
        }
        return res.trim();
        */

/*

String res="";
        int left=0;
        int right=0;
        while(left<s.length() && right<s.length())
        {
            if(s.charAt(right)!=' ')
            right++;
            else
            {
                res=s.substring(left,right)+" "+res;
                left=right;
                right++;
            }
        }
        return res.trim;
        
        */