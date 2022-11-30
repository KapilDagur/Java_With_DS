public class SudokuGame {

    public static boolean canIPlaceValue(char[][] board, int row, int col, char value) {
        //check number isn't exist in column...
        for(int colIdx = 0; colIdx < 9; colIdx++){
            if(board[row][colIdx] == value){
                return false;
            }
        }
        //check number isn't exist in row....
        for(int rowIdx = 0; rowIdx < 9; rowIdx++){
            if(board[rowIdx][col] == value){
                return false;
            }
        }
        int subCol = col - col % 3;
        int subRow = row - row % 3;
        for(int i = subRow; i < subRow + 3; i++){
            for(int j = subCol; j < subCol + 3; j++){
                if(board[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solvePuzzle(char[][] board, int row,int col) {
        //if column exceed the length of board...
        if(col == board.length){
            row++;
            col = 0;
        } 
        //if row exceed the length of board (8x8) means puzzle solved...
        if(row == board.length){
            return true;
        }
        //if cell is not empty...
        if(board[row][col] != '.'){
            return solvePuzzle(board, row, col+1);
        }

        //if cell(row x ++column) is empty... then check sutable value using iteration
        for(int value = 1 ; value <= 9; value++){
            if(canIPlaceValue(board,row, col,(char)('0' + value))){
                board[row][col] = (char)('0' + value);
                boolean result = solvePuzzle(board, row, col+1);
                if(result){
                    return result;
                }
                board[row][col] = '.';
            }
        }
        return false;
        
    }
    public static void printBoard(char[][] board) {
        for(char[] i: board){
            for(char j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void solve(char[][] board){
        solvePuzzle(board, 0, 0);
        printBoard(board);
    }

    public static void main(String[] args) {
        char[][] board = {
                            {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}
                        };
        // printBoard(board);
        solve(board);
    }
}
