class Solution {
    
    public void reverse(int start,int end, int[] nums)
    {
        while(start<end)
        {
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
            
        }        
    }
    
    public void rotate(int[] nums, int k) {
        
        int len=nums.length;
        int mod=k%len;
        if(len==0 ||len==1)
            return;
        reverse(0,len-1,nums);
        reverse(0,mod-1,nums);
        reverse(mod,len-1,nums);
        
        
        
    }
}
