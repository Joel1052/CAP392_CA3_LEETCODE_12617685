 class LC65_Valid_NUmber_Hard {
    
    public boolean isNumber(String s) {
        s = s.trim();
        int minusCount = 0;
        int plusCount = 0;
        int dotCount = 0;
        int exponentCount =0;
        int digitCount = 0;
        int digitAfterExpo =0;

        for(int i =0; i<s.length();i++)
        {
            char temp = s.charAt(i);
            if(Character.isDigit(temp))
            {
                digitCount++;
                if(exponentCount >0)
                    digitAfterExpo++;
            }
            else if(temp =='+' ||temp == '-')
            {
                if(i != 0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E')
                return false;
            }
            else if(temp =='.')
            {
                if(dotCount>0 || exponentCount>0)
                    return false;

                dotCount++;
            }

            else if(temp=='e' || temp == 'E')
            {
                if(exponentCount>0 || digitCount==0 )
                    return false;
                exponentCount++;

            }

            else
                return false;

        }

        if(digitCount >0 && (digitAfterExpo>0 || exponentCount ==0) )
        return true;
        else 
        return false;
        
        
    }

}
