class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public static boolean solve(char[][] board, int row, int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.'){
            return solve(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
            if(isitsafe(board,row,col,i)){
                String s=""+i;
                char ch=s.charAt(0);
                board[row][col]=ch;
                boolean ans=solve(board,row,col+1);
                if(ans){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public static boolean isitsafe(char[][] board, int row, int col, int num){
        //row
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]-'0'==num){
                return false;
            }
        }
        //col
        for(int i=0;i<9;i++){
            if(board[i][col]-'0'==num){
                return false;
            }
        }
        //3X3 matrix
        int r=row-(row%3);
        int c=col-(col%3);
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]-'0'==num){
                    return false;
                }
            }
        }
        return true;
    }
}