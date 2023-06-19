class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++)
        {
            int n=t.indexOf(s.charAt(i));
            if(n!=-1)
                t=t.substring(0,n)+t.substring(n+1);
            else
                return false;
        }
        return true;
        
    }
}