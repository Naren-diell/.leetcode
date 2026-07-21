class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int totel = row * col;

        int [][] res = new int[row][col];

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                 
                 int index = i * col + j ; 
                
                 int newindex = (index + k) % totel;

                 int newrow = newindex / col ;
                 int newcol = newindex % col ;

                 res[newrow][newcol] = grid[i][j]; 
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i= 0 ; i < row ; i ++){

            List<Integer> rows = new ArrayList<>();

            for(int j = 0 ;  j < col  ; j++) {
                 
                 rows.add(res[i][j]);
            }

            ans.add(rows);
        }
        return ans;
    }
}