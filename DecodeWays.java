package akanksha.test.LeetCodePractice;
class DecodeWays {
	public static void main(String args[]){
		numDecodings("10");
	}
	public static int numDecodings(String s) {
		int[] ways = new int[s.length()];
		if(s==null|| s.length()==0 || s.charAt(0)=='0')return 0;
		ways[0]=1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)!='0'){
				ways[i]+=1;
			}
			int n =Integer.parseInt(String.valueOf((s.charAt(i-1)-'0')+""+(s.charAt(i)-'0')));
			if(n>9 && n<=26){
				ways[i]++;
			}
		}
		int count=0;
		for(int i=0;i<ways.length;i++){
			count+=ways[i];
		}
		return count;
	}
}