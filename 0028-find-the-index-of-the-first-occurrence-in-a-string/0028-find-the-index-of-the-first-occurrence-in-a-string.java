class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i=0;i<haystack.length();i++)
       {
           if(haystack.charAt(i)==needle.charAt(0))
           {
               if(i+needle.length()<=haystack.length() && comp(haystack.substring(i,i+needle.length()),needle))
               return i;
           }
       }
       return -1;
        
    }

    public boolean comp(String s1, String s2)
    {
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            return false;
        }
        return true;
    }

}