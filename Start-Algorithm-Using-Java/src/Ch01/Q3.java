package Ch01;

public class Q3 {
	public static void main(String[] args) {
		System.out.println(min(3,2,3,4));
	}
	
	public static int min(int a, int b, int c, int d) {
		int min = a;
		
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		
		return min;
	}
}
