class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int p1 = 0, p2 = 0;
        int max = 0;
        
        HashSet<Character> hs = new HashSet<>();
        
        while(p2<s.length())
        {
            if(!hs.contains(s.charAt(p2))){
                hs.add(s.charAt(p2));
                p2++;
                max = Math.max(max,p2-p1);
            }
            else{
                hs.remove(s.charAt(p1));
                p1++;
            }
        }
        
        return max;
        
    }
}