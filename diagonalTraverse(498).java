// Time O(mn) Space O(mn)
public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int[] result = new int[m*n];
        int r = 0, c = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            if ((r+c)%2 == 0) {
                // go up
                if (c == n - 1) r++;
                else if (r == 0) c++;
                else {
                    r--;
                    c++;
                }
            }else {
                // go down
                if (r == m - 1) c++;
                else if (c == 0) r++;
                else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }