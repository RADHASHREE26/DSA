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
        
        rev_from_k(nums,k,nums.length-1);
        
    }
    
    public void rev_from_k(int arr[], int i, int j)
    {
        if(i>j)
            return;
        else
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            rev_from_k(arr,i,j);
        }
    }
    
}