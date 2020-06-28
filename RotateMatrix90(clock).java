class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int x=0; x<n/2; x++)
        {
            for(int y=x; y<n-1-x;y++)
            {
                int temp=matrix[x][y];
                matrix[x][y]=matrix[n-1-y][x];
                matrix[n-1-y][x]=matrix[n-1-x][n-1-y];
                matrix[n-1-x][n-1-y]=matrix[y][n-1-x];
                matrix[y][n-1-x]=temp;
            }
        }
        
    }
}
