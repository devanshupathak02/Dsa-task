class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {
                    int size = 1;
                    boolean validSquare = true;
                    while (i + size < row && j + size < col && validSquare) {
                        for (int k = 0; k <= size; k++) {
                            if (matrix[i + k][j + size] == '0' || matrix[i + size][j + k] == '0') {
                                validSquare = false;
                                break;
                            }
                        }
                        if (validSquare) size++;
                    }
                    max = Math.max(max, size);
                }
            }
        }
        return max * max;
    }
}