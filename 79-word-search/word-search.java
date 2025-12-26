class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = Search(board,word,i,j,0);
                    if(ans == true){
                        return true;
                    }
                }
            }
        }
         return false;
    }
    public static boolean Search(char board[][],String word,int cr,int cc,int ind){
        if(ind== word.length()){
            return true;
        }
        if(cr>=board.length || cr<0 || cc >= board[0].length || cc <0 || word.charAt(ind) != board[cr][cc]){
            return false;
        }
        board[cr][cc] = '*';
        int r[] ={-1,0,1,0};
        int c[] = {0,-1,0,1};
        for(int i=0;i<r.length;i++){
            boolean ans = Search(board,word,cr+r[i],cc+c[i],ind+1);
            if(ans == true){
                return true;
            }
        }
        board[cr][cc] = word.charAt(ind);
        return false;
    }
}