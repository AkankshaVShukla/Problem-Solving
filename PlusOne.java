//https://leetcode.com/problems/plus-one/description/
class PlusOne {
    public int[] plusOne(int[] digits) {
        int plusOne=1;
        for(int i=digits.length-1;i>=0;i--){
            plusOne += digits[i];
            if(plusOne<10){
                digits[i]=plusOne;
                return digits;
            }else{
                digits[i]=plusOne%10;
                plusOne/=10;
            }
        }
        int[] newDigits = new int[digits.length+1];
        if(plusOne>0){
            newDigits[0]=1;
        }
        return newDigits;
    }
}
