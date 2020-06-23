class Solution {
  
    public int hammingDistance(int x, int y) {
        int a=x^y;
        
        String xor=Integer.toBinaryString(a);
                
        int count=0;
        for(int i=0; i<xor.length(); i++)
        {
            if(xor.charAt(i)!='0' )
                count++;
                
        }
        return count;
        
    }
}
