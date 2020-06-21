class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1); //nlogn
            Arrays.sort(nums2); //nlogn
        
            List<Integer> ansList = new ArrayList<Integer>(); 
            
            int i=0;
            int j=0;
        
        
            while(i<nums1.length && j<nums2.length)
            {
                if(nums1[i]>nums2[j])
                    j++;
                else if (nums1[i]<nums2[j]){
                    i++;
                }
                else{
                    ansList.add(nums1[i]);
                    i++;
                    j++;

                }
            }
            return ansList.stream().mapToInt(k->k).toArray();
            
        }
        
    
}
