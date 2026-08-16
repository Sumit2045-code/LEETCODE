class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newMatrix = new int[col][row];
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                     newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }
}