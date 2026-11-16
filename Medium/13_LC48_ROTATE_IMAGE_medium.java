class LC48_ROTATE_IMAGE_medium {
    public void rotate(int[][] matrix) {
        int temp, size = matrix[0].length ;
        
      for (int i = 0; i< size;i++)
       {
            for(int j = i+1;j<size ;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
       }
       
      int left =0 , right = size -1;
      while (left < right)
      {
      for(int i =0 ; i<size ; i++)
      {
		temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        
      }
      left++; right--;
      }


    }
}
