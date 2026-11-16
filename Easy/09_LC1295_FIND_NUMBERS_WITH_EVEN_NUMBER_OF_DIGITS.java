class LC1295_FIND_NUMBERS_WITH_EVEN_NUMBER_OF_DIGITS {
    public int findNumbers(int[] nums) {

     int count = 0;
     for(int i : nums)
     {
        String s = Integer.toString(i);
        if(s.length() %2 == 0)
        count++;
     }
        return count;
    }
}
