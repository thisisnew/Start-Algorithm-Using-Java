package Ch05;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n) {
		if(n>0) {
			return n*factorial(n-1);
		} else {
			return 1;
		}
	}
}
