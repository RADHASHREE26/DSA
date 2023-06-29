class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int n=nums.length;
        k=k%n;
        
        for(int i=0;i<n/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=temp;
        }
        
        for(int i=0;i<k/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=temp;
        }
        
        int i=k, j=nums.length-1;
        for(i=k,j=nums.length-1;i<j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        
    }
    

    
}