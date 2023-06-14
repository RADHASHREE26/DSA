class Solution {
    public void rotate(int[][] matrix) {
        
        matrix=transpose(matrix);
        
        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix[i]);
        }
        
    }
    
    public int[][] transpose(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat[i].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        return mat;
    }
    
    public static void reverse(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }

}

/*

for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix[i].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix[i]);
        }

    }

    public static void reverse(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    
    */


/*
TRRYYYYYYY

class Solution {
    public void rotate(int[][] matrix) {
        
        matrix=transpose(matrix);
        
        matrix=reverse(matrix);
        
    }
    
    public int[][] transpose(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat[i].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        return mat;
    }
    
    public int[][] reverse(int[][] mat)
    {
        int c=0;
        for(int j=0;j<mat.length;j++)
        {
            int temp=mat[c][j];
            mat[c][j]=mat[c][mat[0].length-1-j];
            mat[c][mat[0].length-1-j]=temp;
            c++;
        }
        return mat;
    }

}

*/