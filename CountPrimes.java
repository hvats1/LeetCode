class Solution {
    public int countPrimes(int n) {
        
        boolean[] prime= new boolean[n];
        
        Arrays.fill(prime,true);
        
        for(int i=2;i*i<n;i++)
        {
            if(prime[i])
            {
             for(int j=i; j*i<n ;j++)
             {
                 prime[j*i]=false;
             } 
            }
        }
        
        int count=0;
        
    for(int k=2;k<n;k++)
    {
    if(prime[k])
       count++;
    }
        
        return count;    
    }
}
