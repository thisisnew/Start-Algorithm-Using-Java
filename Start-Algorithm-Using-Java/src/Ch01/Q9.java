package Ch01;

public class Q9 {
	public static void main(String[] args) {
		System.out.println(sumof(5, 3));
	}
	
	public static int sumof(int a, int b) {
		int sum = 0;
		int start = a;
		int end = b;
		
		if(a>b) {
			start = b;
			end = a;
		}
		
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		
		return sum;	
	}
}
