class Solution {
    public int search(int[] arr, int target) {
        
        if(arr.length==1)
            return (target==arr[0]?0:-1);
        
        int start =0;
        int end=arr.length-1;
        
        while(start<end)
        {
            if(arr[start]==target)
                return start;
            
            if(arr[end]==target)
                return end;
            
            int mid=(start+end)/2;
            
            if(arr[mid]==target)
                return mid;
            
            if(arr[mid]>arr[start])
            {
                if(target>arr[mid])
                    start=mid+1;
                else if(target<arr[start])
                    start=mid+1;
                else
                    end=mid-1;
            }
            else
            {
                if(target>arr[start] && target>arr[mid])
                    end=mid-1;
                else if (target<arr[start] && target<arr[mid])
                    end=mid-1;
                else 
                    start=mid+1;
            }
        }
        
        return -1;
        
    }
}
