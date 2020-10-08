
    static int maxSubsetSum(int[] arr) {

        if(arr.length==1)
        return arr[0];

        
        int dp[] = new int[arr.length+1];
        int max=0;
        dp[0]=0;
        dp[1]=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>dp[i])
            {
                if(dp[i-1]>0)
                dp[i+1]=arr[i]+dp[i-1];
                else
                dp[i+1]=arr[i];
            }
            else
            {
                dp[i+1]=Math.max(dp[i],arr[i]+dp[i-1]);
            }
        
        }

        return dp[arr.length];


    }
