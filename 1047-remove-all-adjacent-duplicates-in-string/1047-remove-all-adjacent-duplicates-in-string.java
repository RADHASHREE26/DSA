class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st=new Stack<>();
        
        st.push(s.charAt(0));

            for(int i=1;i<s.length();i++)
            {
                if(st.isEmpty()==false && st.peek()==s.charAt(i))
                {
                    st.pop();
                }
                else
                    st.push(s.charAt(i));
            }

        s="";
        for(int i=st.size()-1;i>=0;i--)
        {
            s=st.pop()+s;
        }
        return s;
    }
}