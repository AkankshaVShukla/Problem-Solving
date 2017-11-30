//https://leetcode.com/problems/factorial-trailing-zeroes/description/
class ZeroesInNFactorial {
    public int trailingZeroes(int n) {
        int count=0;
        int i=5;
        while(n>4){
            count+=n/5;
            n=n/5;
        }
        return count;
    }
}
