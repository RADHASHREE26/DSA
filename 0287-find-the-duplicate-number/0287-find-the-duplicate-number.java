class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        
        int slow2=nums[0];
        while(slow!=slow2)
        {
            slow=nums[slow];
            slow2=nums[slow2];
            
        }
        
        return slow;
        
        
    }
}

/*
int n = nums.length;
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            nums[nums[i] % n] = nums[nums[i] % n];
            
        }
        
        
        for (int i = 0; i <nums.length ; i++) {
            
            if (nums[i] > n) return i;
            
        }
        
        return -1;
        */