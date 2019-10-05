package Ch01;

public class Q11 {
	public static void main(String[] args) {
		System.out.println(length(10));
	}
	
	public static String length(int a) {
		
		String len = null;
		
		int length = 0;
		
		if(a>0) {
			
			while(a>0) {
				a = a/10;
				length++;
			}
			
			len = String.valueOf(length);
			
		}else {
			len = "양수 입력해주세요";
		}
		
		return len;
	}
}
