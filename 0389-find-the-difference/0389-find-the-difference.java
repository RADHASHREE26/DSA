class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character, Integer> hs=new HashMap<>();
        
        for(int i=0;i<t.length();i++)
        {
            hs.put(t.charAt(i),hs.getOrDefault(t.charAt(i),0)+1);
        }
        
        for(int i=0;i<s.length();i++)
        {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)-1);
        }
        
        for(Map.Entry<Character, Integer> i: hs.entrySet())
        {
            if(i.getValue()==1)
                return (char)(i.getKey());
        }
        
        return ' ';
        
    }
}