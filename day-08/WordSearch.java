public class WordSearch {

        public boolean exist(char[][] board, String word) {
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(search(board,word,i,j,0)){
                        return true;
                    }
                }
            }
            return false;
        }
        boolean search(char[][] board,String word,int row,int col,int pos){
            if(pos==word.length()){
                return true;
            }
            else if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(pos)){
                return false;
            }
            char temp = board[row][col];
            board[row][col] = '$';

            boolean left = search(board,word,row,col-1,pos+1);
            boolean right = search(board,word,row,col+1,pos+1);
            boolean top = search(board,word,row-1,col,pos+1);
            boolean bottom = search(board,word,row+1,col,pos+1);

            if(left || right || top || bottom){
                return true;
            }
            board[row][col] = temp;
            return false;
        }

}
