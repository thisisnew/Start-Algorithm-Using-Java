package Ch01;

public class Q8 {
	public static void main(String[] args) {
		System.out.println(gauss(5));
	}
	
	public static int gauss(int n) {
		
		int mid = 0;
		
		if(n%2 != 0) {
			mid = n/2+1;
		}
		
		int sum = (1+n) * (n/2) + mid;
		
		return sum;
	}
}
