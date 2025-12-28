class Solution {
    public int countNegatives(int[][] grid) {
        int i=0,j=grid[0].length-1,cnt=0;

        while(i < grid.length){
            if(grid[i][j] < 0){
                cnt++;
                j--;
            }
            else if(grid[i][j] >=0){
                j = grid[0].length-1;
                i++;
            }
            if(j <0){
                j=grid[0].length-1;
                i++;
            }
        }
        return cnt;
    }
}