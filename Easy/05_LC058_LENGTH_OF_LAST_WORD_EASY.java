 class LC058_LENGTH_OF_LAST_WORD_EASY {

     public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int size = words[words.length-1].length();

        return size;

    }


}
