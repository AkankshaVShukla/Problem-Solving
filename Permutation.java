package akanksha.test.LeetCodePractice;

public class Permutation {
	public boolean permute(String s, String t){
		if(s.length()!=t.length())return false;
		char[] ch= new char[128];
		for(int i=0;i<s.length();i++){
			ch[s.charAt(i)]++;
		}
		for(int i=0;i<t.length();i++){
			ch[t.charAt(i)]--;
			if(ch[t.charAt(i)]<1)return false;
		}
		
		return true;
	}
}
