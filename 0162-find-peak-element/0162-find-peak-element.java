class Solution {
    public int findPeakElement(int[] nums) {

if (nums.length <= 1) return 0;
        
        int l = 0, r = nums.length - 1;
        
        int res = -1;
        
        while (l <= r) {
            
            int mid = l + (r - l) / 2;
            
            if ((mid == 0 && nums[mid] > nums[mid + 1]) || (mid == nums.length - 1 && nums[mid] > nums[mid - 1])) return mid;
            
            if (mid != 0 && mid != nums.length - 1 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] < nums[mid + 1]) l = mid + 1;
            else r = mid - 1;
            
        }
        
        return res;
    }
}


/*
int peak=Integer.MIN_VALUE;
        int n=nums.length;

        if(nums.length==1)
        return 0;

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]>nums[i+1])
                peak=i;
            }
            
            else if(i==n-1)
            {
                if(nums[i]>nums[i-1])
                peak=i;
            } 
            else
            {
                if(nums[i]>nums[i+1] && nums[i]>nums[i-1])
                peak=i;
            }
        }

        return peak;
        */