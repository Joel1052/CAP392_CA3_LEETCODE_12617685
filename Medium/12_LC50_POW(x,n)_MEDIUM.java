class LC50_POW {
    public double myPow(double x, int n) {
        long N =n;
       boolean isNotNegative = (N >= 0)? true : false;
        
       N =  (N >= 0)? N : N*-1;

        double pow = doMath(x,N);   

       if(isNotNegative)
            return pow;
        
        return 1/pow;
    }
    public double doMath(double x , long N)
    {
        if(N==0)
            return 1;
        
       double temp = doMath(x,N/2);

        if(N%2==0)
        return temp*temp;
        else
            return temp*temp*x;
    }
}
