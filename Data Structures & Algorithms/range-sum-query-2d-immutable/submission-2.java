class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int m=row1;m<=row2;m++){ 
            for(int n=col1;n<=col2;n++){ 
                sum+=matrix[m][n];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */