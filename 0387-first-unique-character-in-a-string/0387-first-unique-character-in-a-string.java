class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
       for (int i = 0; i <= s.length() - 1; i++) {
            
            if (hm.get(s.charAt(i)) == 1) return i;
            
        }

        return -1;
        
    }
}