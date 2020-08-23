class Solution {

    public int maxSubArray(int[] nums) {    
        if(nums.length==0)
            return Integer.MIN_VALUE;
        if(nums.length==1)
            return nums[0];
        
        int max_val=nums[0];
        int ans=max_val;
        int i=1;
        while(i<nums.length)
        {
           max_val= Integer.max(nums[i],nums[i]+max_val);  
            ans=ans<max_val?max_val:ans;
           i++;
        }
        
        
    return ans;
    
        
    }
    
}
