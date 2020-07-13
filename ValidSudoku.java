class Solution {

    public static boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
                    Set<Character> setRow = new HashSet<Character>();
                    Set<Character> setCol = new HashSet<Character>();
                    Set<Character> setMatrix = new HashSet<Character>();

            for(int j=0;j<9;j++)
            {
            if(board[i][j]!='.' && !setRow.add(board[i][j]))
                return false;
                        
                  if(board[j][i]!='.' && !setCol.add(board[j][i]))
                     return false;

                
                int rowIndex=3*(i/3);
                int colIndex=3*(i%3);
                
    if(board[rowIndex+j/3][colIndex+j%3]!='.' && !setMatrix.add(board[rowIndex+j/3][colIndex+j%3]))
                return false;
                }
            }
        
        return true;    }
}
