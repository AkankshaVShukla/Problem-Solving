 
public class AddDigits {
	public static void main(String args[]){
		System.out.println(addDigits(284));
	}
	
	public static int addDigits(int num){
		return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
	}
	
	public static int iterativeAddDigits(int n){
		if(n<9)return n;
		int sum=0;
		while(n>0 || sum > 9){
			sum+=n%10;
			n=n/10;
		}
		return n;
	}
}
