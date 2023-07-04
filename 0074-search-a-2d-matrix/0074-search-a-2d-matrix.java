class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        boolean res=false;
        int n=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][n]>=target)
            {
                res=binarySearch(matrix[i], target);            
                if(res)
                return res;
            }

        }
        
        return false;

    }
    
    public boolean binarySearch(int arr[], int x)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return true;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
    
}

/*

int i=0,j=matrix[0].length-1;
        while (i<matrix.length && j<matrix[0].length && i>=0 && j>=0)
        {
            if(matrix[i][j]==target)
            return true;
            else
            {
            if(matrix[i][j]>target)
            {
                j--;
            }
            else
            i++;
            }
        }
        return false;
        
        */