
public class Zigzag {
	public static void main(String args[]){
		System.out.println(zigzag("PAYPALISHIRING", 3));	
	}
	
	public static String zigzag(String s, int n){
		StringBuilder[] sb = new StringBuilder[n];
		for(int i=0;i<n;i++){
			sb[i]=new StringBuilder();
		}
		int i=0;
		while(i<s.length()){
			for(int j=0;j<n && i<s.length();j++){
				sb[j].append(s.charAt(i));
				i++;
			}
			for(int j=n-2;j>0 && i<s.length();j--){
				sb[j].append(s.charAt(i));
				i++;
			}
		} 
		
		for(int k=1;k<n;k++){
			sb[0].append(sb[k]);
		}
		
		
		
		return sb[0].toString();
	}
}
