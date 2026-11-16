class LC367_Valid_Perfect_Square_EASY {
    public boolean isPerfectSquare(int num) {
        long start = 0,end = num;


        while (start <= end)
        {   
            long mid = (start + end)/2 ;
            long midSquare = mid*mid;

            if(midSquare == num)
                return true;
            else if(midSquare < num)
            {
                start = mid+1;
            }
            else 
                end = mid-1;
        }

        return false;

    }
}
