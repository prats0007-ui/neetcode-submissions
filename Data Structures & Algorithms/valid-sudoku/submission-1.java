public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check if the numbers in the rows are duplicate
        
        for(int i=0;i<9;i++){ 
            Set<Character> seen =new HashSet<>();
            for(int j=0;j<9;j++){ 
                if(board[i][j]=='.') continue; 
                if(seen.contains(board[i][j])) return false; 
                seen.add(board[i][j]);
            }
        }

        // check if the numbers in the column are duplicate

        for(int i=0;i<9;i++){ 
            Set<Character> seen =new HashSet<>();
            for(int j=0;j<9;j++){ 
                if(board[j][i]=='.') continue; 
                if(seen.contains(board[j][i])) return false; 
                seen.add(board[j][i]);
            }
        }

        // deal with the squares one by one
        // check if that element is seen already before adding it
        //  1 2 3
        //  4 5 6 
        //  7 8 9
        //  if you want to calc the position of 8 in 3x3: 
        //  row = i / 3 and col = j % 3
        int row=0,col=0;
        for(int square=0;square<9;square++){ 
            Set<Character> seen =new HashSet<>();
            for(int i=0;i<3;i++){ 
                for(int j=0;j<3;j++){ 
                    
                    row = (square /3)*3+i; 
                    col = (square %3)*3+j; 
                    if(board[row][col]=='.') continue;
                    if(seen.contains(board[row][col])) return false; 
                    seen.add(board[row][col]);


                }
            }
        }
        return true;
    }
}