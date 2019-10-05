package Ch01;

public class Median {
	public static void main(String[] args) {
		System.out.println(med(1,3,2));
	}
	
	public static int med(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}
}
