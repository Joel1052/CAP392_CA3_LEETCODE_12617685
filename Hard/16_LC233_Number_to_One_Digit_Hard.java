class LC233_Number_to_One_Digit_Hard {
public int countDigitOne(int n) {

      long count = 0;

    for (long position = 1; position <= n; position *= 10) {

        long higher = n / (position * 10);
        long current = (n / position) % 10;
        long lower = n % position;

        if (current == 0) {
            count += higher * position;
        }
        else if (current == 1) {
            count += higher * position + lower + 1;
        }
        else {
            count += (higher + 1) * position;
        }
    }

    return (int) count;

    }    
}
