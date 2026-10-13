class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen;
        for(int row = 0; row < board.length; row++) {
            seen = new HashSet<>();    
            for(int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }

        for(int col = 0; col < board[0].length; col++) {
            seen = new HashSet<>();
            for(int row = 0; row < board.length; row++) {
                if (board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }

        for(int square = 0; square < 9; square++) {
            seen = new HashSet<>();
            for(int row = 0; row < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    int currRow = (square/3) * 3 + row;
                    int currCol = (square % 3) * 3 + col;

                    if (board[currRow][currCol] == '.') continue;
                    if(seen.contains(board[currRow][currCol])) return false;
                    seen.add(board[currRow][currCol]);
                }
            }
        }
        return true;
    }
}
