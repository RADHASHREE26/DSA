import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hs=new HashMap<>();

        int res[]=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            int s=target-nums[i];
            if(hs.containsKey(s))
            {
                res[0]=i;
                res[1]=hs.get(s);
                return res;
            }
            else
            hs.put(nums[i],i);
        }
        return res;
        

    }
}

/*


        Hashtable<Integer,Integer> h=new Hashtable<>();

        for(int i=0;i<nums.length;i++)
        {
            int t=target-nums[i];
            if(h.containsKey(t))
            {
                int ar[]=new int[2];
                ar[0]=h.get(t);
                ar[1]=i;
                return ar;
            }
            else
            h.put(nums[i],i);
        }
        return nums;

        */


/*
        List<Integer> al= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
        Arrays.sort(nums);

        int res[]=new int[2];

        int i=0,j=nums.length-1;
        while(i<j)
        {
            if(nums[j]>target || nums[i]+nums[j]>target)
            j--;
            else if(nums[i]+nums[j]<target)
            i++;
            else
            {
                res[0]=al.indexOf(nums[i]);
                res[1]=j;
                return res;
            }
        }
        return res;

*/

/*

int res[]=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }

        return res;

        */