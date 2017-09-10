
public class Power {
	double powerLinear(double x, int n){
		if(n==0)return 1;
		for(int i=1; i<=n; i++){
			x*=x;
		}
		return x;
	}

	double powerOptimised(double x, int n){
		double result=1;
		if(n==0)return 1;
		result=powerOptimised(x, n/2);
		if(n%2!=0){
			return n<0? 1/x*result*result:x*result*result ;
		}else{
			return result*result;
		}
	}
}
