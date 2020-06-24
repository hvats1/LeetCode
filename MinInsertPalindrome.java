class Solution {
    public int minInsertions(String str1) {
        int len=str1.length();
        String str2 = new StringBuilder(str1).reverse().toString();
        int[][] dp = new int[len+1][len+1];
        
        for(int i=0; i<len+1;i++)
        {
            for(int j=0;j<len+1;j++)
            {
                if(i==0 || j==0)
                dp[i][j]=0;
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Integer.max(dp[i-1][j],dp[i][j-1]);
                    
            }
            
        }
        
         return  (len-dp[len][len]);
        
    
    }
}
