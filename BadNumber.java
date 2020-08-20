  /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lower=1;
        int upper=n;    
        while(lower<upper)
        {
            int mid=lower + (upper-lower)/2;
            if(isBadVersion(mid))
             upper=mid;   
            else
                lower=mid+1;
        }
        return lower;
        
    }
}
