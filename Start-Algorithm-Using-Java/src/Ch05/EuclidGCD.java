package Ch05;

public class EuclidGCD {
	
	public static void main(String[] args) {
		System.out.println(gcd(6, 9));
	}
	
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		} else {
			System.out.println("x :" +x);
			System.out.println("y :" +y);
			return gcd(y, x % y);
		}
	}
}
