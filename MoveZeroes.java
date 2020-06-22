class Solution {
    public void moveZeroes(int[] nums) {
        
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                c++;
            else
                nums[i-c]=nums[i];
                
        }
        
        if(c==0)
            return;
        
        for(int i=nums.length-1;i>=nums.length-c;i--)
            nums[i]=0;
        
        
        
        
    }
}
