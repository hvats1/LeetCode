import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
            return true;
        s= s.toLowerCase();
        String regex="[0-9]*[a-z]*";
        Pattern pattern =Pattern.compile(regex);
        int i=0;
        int k=s.length()-1;
        
    while (i<=k)
{      
            if(!pattern.matcher(String.valueOf(s.charAt(i))).matches())
                i++;
            else if (!pattern.matcher(String.valueOf(s.charAt(k))).matches())
                k--;
            else {
                if(s.charAt(i) != s.charAt(k))
                    return false;
                i++;
                k--;
            }
                
        }
        return true;
        
    }   
        
 
}
