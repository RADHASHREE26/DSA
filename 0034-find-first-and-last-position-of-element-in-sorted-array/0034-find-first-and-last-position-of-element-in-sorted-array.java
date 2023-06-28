class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        if(nums.length==0)
            return new int[]{-1,-1};
        
        int n=helper(nums,0,nums.length-1,target);
        
        if(n==-1)
            return new int[]{-1,-1};
        
        int i=n;
        int j=n;
        
        while(i>=0 && nums[i]==target)
            i--;
        
        while(j<nums.length && nums[j]==target)
            j++;
        
        
        return new int[]{i+1,j-1};
        
    }
    
    public int helper(int[] arr, int low, int high, int target)
    {
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        
        return -1;
        
    }
    
}