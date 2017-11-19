class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null || s.isEmpty())return true;
        int start=0, end=s.length()-1;
        char currentStart=0, currentEnd=0;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
