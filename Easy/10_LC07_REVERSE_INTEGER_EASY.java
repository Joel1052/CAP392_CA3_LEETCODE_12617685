 class LC07_REVERSE_INTEGER {
    public int reverse(int x) {
        long reverse = 0;
        while (x!= 0)
        {
            reverse = (reverse *10) + (x %10);
            x /= 10;

        }

        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE)
            reverse = 0;
        return (int)reverse;
    }
}
