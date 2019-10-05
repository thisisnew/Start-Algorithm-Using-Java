package Ch01;

public class Q10 {
	public static void main(String[] args) {
		System.out.println(minus(1,1));
	}
	
	public static String minus(int a, int b) {
		String sum = "";
		
		if(a>b) {
			sum = "a보다 큰 b값 입력바람";
		}else {
			sum  = String.valueOf(b-a);			
		}
		
		return sum;
	}
}
