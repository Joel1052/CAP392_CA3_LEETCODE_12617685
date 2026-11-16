class LC73_SET_MATRIX_ZEROES_MEDIUM {
    public void setZeroes(int[][] matrix) {
        int sizeRow = matrix.length;
        int sizeColumn = matrix[0].length;
        boolean[] indexi = new boolean[sizeRow];
        boolean[] indexj = new boolean[sizeColumn];
        int newi = 0, newj =0;

        for(int i =0 ;i<sizeRow;i++)
        {
            for(int j = 0; j<sizeColumn ; j++)
            {
                if(matrix[i][j] == 0 )
                {
                  indexi[i] = true;
                  indexj[j] = true;       
                }             
            }
        }

        for(int i=0; i<sizeRow;i++)
        {
            for(int j =0 ;j<sizeColumn;j++)
            {
                if(indexi[i] == true || indexj[j]==true)
                    matrix[i][j]= 0;
            }
        }

    }    
}
