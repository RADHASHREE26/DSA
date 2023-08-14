class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        
        int i=0;
        if(n==0)
        return;
        while(i<m)
        {
            if(arr1[i]<arr2[0])
            i++;
            else
            {
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                Arrays.sort(arr2);
                i++;
            }
        }
        for(int k=0;k<n;k++)
        {
            arr1[i++]=arr2[k];
        }
        
        
        
    }
}