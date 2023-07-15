class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st=new Stack<>();
        HashMap<Integer, Integer> hs=new HashMap<>();
        
        for(int i=0;i<nums2.length;i++)
        {
            while(st.isEmpty()==false && st.peek()<nums2[i])
            {
                int n=st.pop();
                hs.put(n,nums2[i]);
            }
            st.push(nums2[i]);
        }
        
        int res[]=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++)
        {
            if(hs.containsKey(nums1[i]))
                res[i]=hs.get(nums1[i]);
            else
                res[i]=-1;
        }
        
        return res;
        
    }
}