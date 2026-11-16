class LC125_Valid_Palindrome_Easy {
   
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
        int first = 0;
        int last = s.length()-1;
    
        
        while(first <= last)
        {
            char firstChar = s.charAt(first);
            char lastChar = s.charAt(last);

            if (!Character.isLetterOrDigit(firstChar)) {
                 first++;
                 continue;
            }

            if (!Character.isLetterOrDigit(lastChar)) {
                 last--;
                 continue;
            }

            if(firstChar != lastChar)
                return false ;

            last--;
            first++;



        }
        return true;
    }
}
