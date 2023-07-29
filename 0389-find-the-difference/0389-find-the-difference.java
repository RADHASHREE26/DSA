class Solution {
    public char findTheDifference(String s, String t) {
        
        int ar[]=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            ar[t.charAt(i)-'a']++;
            ar[s.charAt(i)-'a']--;
        }
        
        ar[t.charAt(t.length()-1)-'a']++;
        
        for(int i=0;i<26;i++)
        {
            if(ar[i]==1)
                return (char)(i+'a');
        }
        
        return ' ';
        
    }
}

/*

HashMap<Character, Integer> hs=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            hs.put(t.charAt(i),hs.getOrDefault(t.charAt(i),0)+1);
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)-1);
        }
        
        hs.put(t.charAt(t.length()-1),hs.getOrDefault(t.charAt(t.length()-1),0)+1);
        
        for(Map.Entry<Character, Integer> i: hs.entrySet())
        {
            if(i.getValue()==1)
                return (char)(i.getKey());
        }
        
        return ' ';
        
        */