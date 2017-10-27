package akanksha.test.LeetCodePractice;

public class CountPrimes {
	public static void main(String args[]){
		System.out.println(countPrime(15));
	}
	public static int countPrime(int n){
		int count=0;
		if(n<2)return 0;
		boolean[] prime=new boolean[n];
		for(int i=2;i<n;i++){
			if(prime[i]){
				continue;
			}
			count++;
			for(int j=i;j<n;j=j+i){
				prime[j]=true;
			}
		}
		return count;
	}
}
