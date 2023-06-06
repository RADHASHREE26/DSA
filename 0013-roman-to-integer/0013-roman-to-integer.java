class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hs= new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);

        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int n1=hs.get(s.charAt(i));
            int n2=hs.get(s.charAt(i+1));
            if(n1<n2)
            sum-=n1;
            else
            sum+=n1;
        }
        sum+=hs.get(s.charAt(s.length()-1));
        return sum;
    }
}