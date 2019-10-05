package Ch01;

public class Q1 {
	public static void main(String[] args) {
		System.out.println(max(3,4,5,4));
	}
	
	public static int max(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
}
