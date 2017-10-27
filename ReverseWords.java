package akanksha.test.LeetCodePractice;

public class ReverseWords {

	public static void main(String args[]){
		System.out.println(reverse("the sky is blue"));
	}
	public static String reverse(String s){
		String[] words = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<words.length;i++){
			sb.insert(0, words[i]);
			if(i<s.length())sb.insert(0, " ");
		}
		return sb.toString();
	}
}
