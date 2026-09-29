// https://leetcode.com/problems/set-matrix-zeroes/description/

// Brute Force :
// TC : O(N * M * (N + M))
// SC : O(1)
class Solution1 {
    public void setMatrixZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(i, matrix, m);
                    markCol(j, matrix, n);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markRow(int row, int[][] matrix, int m) {
        for (int j = 0; j < m; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    private void markCol(int col, int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }
}


// Acceptable for negative number of matrix (GFG) :
class Solution2 {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        // Step 1: Find all zero positions
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Set marked rows and columns to zero
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}