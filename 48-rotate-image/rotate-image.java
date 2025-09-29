class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix[0].length;i++){
            int left =0;
            int right = matrix.length-1;
            while(left < right){
                int temp = matrix[left][i];
                matrix[left][i] = matrix[right][i];
                matrix[right][i] = temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}