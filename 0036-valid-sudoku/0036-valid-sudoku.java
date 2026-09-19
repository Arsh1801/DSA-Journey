class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char check = board[i][j];
                if (check != '.') {
                    int count = 0;
                    for (int k = 0; k < board.length; k++) {
                        if (check == board[i][k]) {
                            count++;
                        }
                        if (check == board[k][j]) {
                            count++;
                        }
                        if (count > 2) {
                            return false;
                        }
                    }
                }
            }
        }
        for (int rowBlock = 0; rowBlock < 9; rowBlock += 3) {
            for (int colBlock = 0; colBlock < 9; colBlock += 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char check = board[rowBlock + i][colBlock + j];
                        if (check == '.')
                            continue;
                        int count = 0;
                        for (int r = 0; r < 3; r++) {
                            for (int c = 0; c < 3; c++) {
                                if (check == board[rowBlock + r][colBlock + c]) {
                                    count++;
                                }
                            }
                        }
                        if (count > 1) {
                            return false;
                        }
                    }
                }

            }
        }
        return true;
    }
}