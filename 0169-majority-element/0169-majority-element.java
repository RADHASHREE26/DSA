class Solution {
    public int majorityElement(int[] arr) {
        
        HashMap<Integer, Integer> hm=new HashMap<>();
        

        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        int l=arr.length/2;
        for(int i=0;i<arr.length;i++)
        {
            if(hm.get(arr[i])>l)
                return arr[i];
        }
        return -1;
    }
}

/*

int c=0,ele=0;

		for(int i=0;i<arr.length;i++)
		{
			if(c==0)
			ele=arr[i];
			if(ele==arr[i])
			c++;
			else
			c--;
		}
		
		return ele;
        
        */