class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character, Character> hs1=new HashMap<>();
        HashMap<Character, Character> hs2=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if((hs1.containsKey(s.charAt(i)) && hs1.get(s.charAt(i))!=t.charAt(i)) || (hs2.containsKey(t.charAt(i)) && hs2.get(t.charAt(i))!=s.charAt(i)))
                return false;
            hs1.put(s.charAt(i),t.charAt(i));
            hs2.put(t.charAt(i),s.charAt(i));
                
        }
        return true;
        
    }  
}