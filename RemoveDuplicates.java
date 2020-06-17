class Solution {
    
    public int removeDuplicates(int[] nums) {
        int count=1;
        int prev = -1;
        
        if(nums.length==0)
            return 0;

        prev=nums[0];
          
        for(int i=0;i<nums.length-1;i++)
        {   
            if(prev!=nums[i+1])
            {
                prev=nums[i+1];
            nums[count++]=prev;                
            }
                
        }
        return count;        
        
    }
}
