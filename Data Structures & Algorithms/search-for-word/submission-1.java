class Solution {
    int rowCount;
    int columnCount;
    int letterIndex;
    String word;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        // split word letter-by-letter
        // check the desired letter in neigboring cells (up or down or left or right)
        // if more than one matched cell try each of them
        // return immedialately when the condition not satisfied
        // can be used recursive
        this.board = board;
        this.word = word;
        rowCount  = board.length;
        columnCount = board[0].length;
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < columnCount; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean result = tracer(i, j, 0);
                    if(result == true) return true;
                }
            }
        }
        return false;
    }

    public boolean tracer(int row, int col, int letterIndex) {
        if(row < 0 || col < 0 || row >= rowCount || col >= columnCount) return false;
        if(board[row][col] != word.charAt(letterIndex)) return false;
        if(letterIndex == word.length() - 1) return true;

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = tracer(row + 1, col, letterIndex + 1) ||
            tracer(row - 1, col, letterIndex + 1) ||
            tracer(row, col + 1, letterIndex + 1) ||
            tracer(row, col - 1, letterIndex + 1);

        board[row][col] = temp;
        return found;
    }
}