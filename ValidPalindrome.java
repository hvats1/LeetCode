

class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
            return true;
       String s1= s.toLowerCase();
        int i=0;
        int k=s1.length()-1;

        while(i<=k)
        {
            if(!Character.isLetterOrDigit(s1.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s1.charAt(k)))
                k--;
            else
            {
                if(s1.charAt(i)!=s1.charAt(k))
                    return false;
                i++;
                k--;
            }

        }
        return true;
        
    }   
        
 
}
