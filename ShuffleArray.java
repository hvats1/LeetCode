class Solution {
    int[] org;
    int[] arr;
    public Solution(int[] nums) {
        this.org= nums.clone();   
        this.arr=nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.org;
    }
    

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len=this.arr.length;         
        int[] temp = arr;
        Random r = new Random();
        int i=0;
        while(i++<len)
        {
            int var1=r.nextInt(len);
            int var2=r.nextInt(len);
        if(var1!=var2)
        {
        int tmp=temp[var1];
        temp[var1]=temp[var2];
        temp[var2]=tmp;
        }
            
        }
            
            return temp;
    }
       
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
