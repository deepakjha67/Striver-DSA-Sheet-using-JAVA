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

// TC : O(2*n*m)
// SC : O(n) + O(m)


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



// Optimal : 

// TC : O(n * m)
// SC : O(1)

class Solution3 {
    // Updates the matrix after zeroing affected rows and columns.
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;

        // An empty matrix has no row or column to update.
        if (rows == 0) {
            return;
        }

        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check whether the first row must be cleared later.
        for (int col = 0; col < cols; col++) {
            // A zero in the first row must be remembered before markers change it.
            if (matrix[0][col] == 0) {
                firstRowZero = true;
            }
        }

        // Check whether the first column must be cleared later.
        for (int row = 0; row < rows; row++) {
            // A zero in the first column must be remembered before markers change it.
            if (matrix[row][0] == 0) {
                firstColZero = true;
            }
        }

        // Store row and column markers inside the first row and first column.
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                // An inner zero marks its whole row and column.
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Apply markers to the inner part of the matrix.
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                // A zero row marker or column marker clears this cell.
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // The saved first-row status decides whether the first row is cleared.
        if (firstRowZero) {
            for (int col = 0; col < cols; col++) {
                matrix[0][col] = 0;
            }
        }

        // The saved first-column status decides whether the first column is cleared.
        if (firstColZero) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}