class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hs=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);
            
            if(!hs.containsKey(st))
                hs.put(st, new LinkedList<String>());
            hs.get(st).add(s);
            
        }
        
        return new LinkedList<>(hs.values());
        
    }
    
}

/*

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res=new ArrayList<>();
        
        for(int i=0;i<strs.length;i++)
        {
            if(res.isEmpty())
            {
                List<String> r1=new ArrayList<>();
                r1.add(strs[i]);
                res.add(r1);
            }
            else
            {
                int c=0;
                for(int j=0;j<res.size();j++)
                {
                    boolean check=anagrams(res.get(j).get(0), strs[i]);
                    if(check)
                    {
                        List<String> innerList = res.get(j);
                        innerList.add(strs[i]);
                    }
                    else
                        c++;
                }
                if(c==res.size())
                {
                    List<String> r1=new ArrayList<>();
                    r1.add(strs[i]);
                    res.add(r1);
                }
            }
        }
            
            return res;
            
        }
    
    public boolean anagrams(String s, String t)
    {
        if(s.length()!=t.length())
            return false;
        
        int c[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int n1=s.charAt(i)-'a';
            int n2=t.charAt(i)-'a';
            c[n1]++;
            c[n2]--;
        }
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=0)
                return false;
        }
        return true;
    }
    
}

*/