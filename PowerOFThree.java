class Solution {
    public boolean isPowerOfThree(int n) {
    
        if(n<0)
            return false;
        if(n==0)
            return false;
        
    double val=n;
    if(Math.pow(3,19)%Math.abs(val)==0)
        return true;
    else
        return false;
    }
}
