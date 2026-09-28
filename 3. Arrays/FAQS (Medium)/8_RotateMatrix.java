// https://leetcode.com/problems/rotate-image/description/

// SC :
// TC :
class Solution {
    public void rotate(int[][] matrix) {

        int N = matrix.length;

        //Step : 1 (Transpose of the matrix)

        //  SWAP matrix[i][j] , matrix[j][i] : [0, 1] = [ 1, 0]
        

        for(int row = 0; row < N; row++){

            for(int col = row+ 1; col < N; col++){
                // swap matrix[i][j] , matrix[j][i]
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        //Step : 2(Reverse all rows of the matrix)

        for(int row = 0; row <N; row++){
            // Now we are at new row -> start reverse
            int startcol = 0;
            int endcol = N-1;
            while(startcol  <= endcol){
                // Swap matrix[row][startcol], matrix[row][endcol]
                int temp = matrix[row][startcol];
                matrix[row][startcol] = matrix[row][endcol];
                matrix[row][endcol] = temp;

                startcol++;
                endcol--;
            }
        }
    }
}