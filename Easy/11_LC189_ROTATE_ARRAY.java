class LC189_ROTATE_ARRAY {
    public void rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        int count = 1;
        
        while(count <= k)
        {
            for(int i =0; (i+k)< nums.length;i++)                 
                newNums[i+k]= nums[i];

            for(int i=k-1;i>=0;i--)
                newNums[i] = nums[nums.length-k+i];
            count++;
        }
    



    }
}
