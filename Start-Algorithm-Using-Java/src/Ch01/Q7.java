package Ch01;

public class Q7 {
	public static void main(String[] args) {
		System.out.println(tot(7));
	}
	
	public static int tot(int n) {
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
