package Ch05;

public class Q2 {
	public static void main(String[] args) {
		System.out.println(gcd(6, 9));
	}
	
	static int gcd(int x, int y) {
			while(y!=0) {
				System.out.println("x : "+ x);
				System.out.println("y : "+ y);
				int temp = y;
				y = x % y;
				x =  temp;
				
			}
			return x;
	}
}
