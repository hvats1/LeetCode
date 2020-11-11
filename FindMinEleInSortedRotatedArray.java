class Solution {
    
    private static int min(int[] arr, int start,int end)
    {
        
        int mid=(start+end)/2; //3
        
        if(mid == start || mid == end)
            return Math.min(arr[start],arr[end]);
        
        if(arr[mid]<arr[start])
                 return min(arr,start,mid);             
        else
            return min(arr,mid,end);    
    }
    
    public int findMin(int[] arr) {
        
        if(arr.length==1)
            return arr[0];
        
        
        int start=0;
        int end=arr.length-1;
        
        if(arr[start]<arr[end])
            return arr[start];
        
        return min(arr,start,end);        
        
    }
}
