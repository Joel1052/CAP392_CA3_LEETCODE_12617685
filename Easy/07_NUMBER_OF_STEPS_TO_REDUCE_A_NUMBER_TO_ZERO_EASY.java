class NUMBER_OF_STEPS_TO_REDUCE_A_NUMBER_TO_ZERO {
    public int numberOfSteps(int num) {
        int i =0; 
        while(num!=0)
        {
            i++;
            if(num %2 ==0)
                num /= 2;
            else 
                num -=1;
        }

        return i;
    }
}
