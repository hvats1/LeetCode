class Solution {
    private static boolean match(int[] arr1,int[] arr2)
    {
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()==0)
            return true;
        
        if(s1.length()>s2.length())
            return false;
        
        int[] s1_arr = new int[26];
        int[] s2_arr = new int[26];
        
        for(int i=0;i<s1.length();i++)
            s1_arr[s1.charAt(i)-'a']++;
                
            for(int j=0; j<s1.length();j++)
            s2_arr[s2.charAt(j)-'a']++;

        for(int i=0; i<s2.length()-s1.length(); i++)
        {
            if(match(s1_arr,s2_arr))
                return true;
            
            s2_arr[s2.charAt(i)-'a']--;
            s2_arr[s2.charAt(i+s1.length())-'a']++;
            
        }
        
        return match(s1_arr,s2_arr);
        
    }
}
