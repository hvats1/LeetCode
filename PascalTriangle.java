class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ansList = new ArrayList<>();
        
        if(numRows==0)
            return ansList;
               
    int i=1;
       
   while(i<=numRows)
   {
        if(i==1)
        {
           ansList.add(Arrays.asList(1));
        }
        else if(i==2)
        {
         ansList.add(Arrays.asList(1,1));
        }
       else{
       List<Integer> temp = new ArrayList<>();
       temp.add(1);

      List<Integer> temp1= ansList.get(i-2);
       
       for(int a=0;a<temp1.size()-1;a++)
           temp.add(temp1.get(a)+temp1.get(a+1));
       
      temp.add(1);
       
       ansList.add(temp);
       }
       i++;
      
   }
return ansList;
        
    }
}
