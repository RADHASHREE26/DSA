class Solution {
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int carry=0;
        int sum=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            sum=sum+digits[i]+carry;
            carry=sum/10;
            al.add(sum%10);
            sum=0;
        }
        if(carry!=0)
            al.add(carry);
        int ar[] = new int[al.size()];
        int k=al.size()-1;
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=al.get(k--);
        }
        
        return ar;
        
    }
}

       