class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        
        if(len==0 || len==1)
            return false;
        
        Set<Integer> set = new HashSet<Integer>(len);
        
        for(int a:nums)
        {
            if(set.contains(a))
                return true;
            else set.add(a);
        }
 
        return false;
        
        
        
    }
}
