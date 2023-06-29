class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
    }
    
    public void reverse (int[] arr, int i, int j) {
        
        int l = i, r = j;
        
        while (l < r) {
            
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            l++;
            r--;
            
        }

        
    }
}

/*

 
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
        
        int i=k, j=n-1;
        for(i=k,j=n-1;i<j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        
        */