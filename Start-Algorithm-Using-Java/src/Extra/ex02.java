package Extra;

public class ex02 {
	
	public static void main(String[] args) {
		int cnt = 0;
		
		recur(cnt);
	}
	
	static void recur(int cnt) {
		
		if(cnt == 10) {
			System.out.println(cnt);
		} else {
			recur(++cnt);
		}
		
	}
	
}
