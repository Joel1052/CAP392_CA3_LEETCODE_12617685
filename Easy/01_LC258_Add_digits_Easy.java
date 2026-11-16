class Solution {
    public static int addDigits(int num) {
        int a =0;
        while (num > 0 )
        {
            a += num % 10;
            num = num /10;
            if(num == 0 && a > 9)
            {
                num = a;
                a=0;
            }
        } 
        return a;
    }
}