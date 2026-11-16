class LC231_POWER_OF_TWO {
    public boolean isPowerOfTwo(int n) {
       if(n<= 0)
        return false;
    
        while (n %2 ==0)
        {
            n /= 2;
        }

        return n==1;
    }
}
