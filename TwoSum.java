class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i<nums.length;i++)
        {
            if(!map.keySet().contains(nums[i]))
                map.put(target-nums[i],i);
            else
            {   
                ans[0]=i;
                ans[1]=map.get(nums[i]);
                return ans;
                }   
                
        }
        
        return ans;
        
        
    }
}
