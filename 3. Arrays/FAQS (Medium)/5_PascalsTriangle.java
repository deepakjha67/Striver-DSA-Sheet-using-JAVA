// https://leetcode.com/problems/pascals-triangle/submissions/2173130756/

// TC : 
// SC : 

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int row = 1; row <= numRows; row++){
            List<Integer> temp = new ArrayList<>(row+1);
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row){
                    temp.add(1);
                } else{
                    int colIdx = col -1;
                    int rowIdx = row -1;

                    int prevRowIdx = rowIdx -1;

                    int val1 = res.get(prevRowIdx).get(colIdx);
                    int val2 = res.get(prevRowIdx).get(colIdx -1);

                    temp.add(val1 + val2); 
                }
                
            }
            res.add(temp);
        }
        return res;
    }
}