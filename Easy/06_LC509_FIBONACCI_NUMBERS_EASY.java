 class LC509_FIBONACCI_NUMBERS {
  public int fib(int n) {
        if(n <=1)
            return n;
        
        return fib(n-1)+fib(n-2);
    }   
}
