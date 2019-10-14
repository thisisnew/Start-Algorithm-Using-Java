package Ch05;

public class Q1 {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n) {
		if(n>0) {
	
			int sum = 1;
			
			for(int i=n; i>=1; i--) {
				sum *= i;
			}
			
			return sum;
		} else {
			return 1;
		}
	}
}
