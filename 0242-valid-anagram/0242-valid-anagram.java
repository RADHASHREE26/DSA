class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
             
        }
        for(Character c: map.keySet())
        {
            if(map.get(c)!=0)
                return false;
        }
        return true;
        
        
        
    }
}

/*
BRUTE-FORCE

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
        
        */