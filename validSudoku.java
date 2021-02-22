    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet();
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j] + "box " + ((i/3)*3+(j/3)))||
                        !set.add(board[i][j] + "row " + i)||
                        !set.add(board[i][j] + "col " + j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }