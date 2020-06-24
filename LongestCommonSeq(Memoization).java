class Solution {
    
    int lcs(String str1, String str2, int s1, int s2,int[][] matrix)
    {
        if(s1==0 || s2==0)
            return 0;
        
        if(matrix[s1][s2]!=-1)
            return matrix[s1][s2];
        
        if(str1.charAt(s1-1) ==str2.charAt(s2-1))
        {
             matrix[s1][s2]=1+lcs(str1,str2,s1-1,s2-1,matrix);
            return matrix[s1][s2];
        }
        else
            { matrix[s1][s2]= Math.max(lcs(str1,str2,s1,s2-1,matrix),lcs(str1,str2,s1-1,s2,matrix));
              return matrix[s1][s2];
            }
            
        
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
         int[][] matrix = new int[m+1][n+1];

        for (int[] row: matrix)
        Arrays.fill(row, -1);
        
        
        return lcs(text1,text2,text1.length(),text2.length(),matrix);
        
        
    }
}
