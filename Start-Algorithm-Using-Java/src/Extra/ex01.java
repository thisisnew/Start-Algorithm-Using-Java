package Extra;

import java.util.Arrays;

public class ex01 {
	public static void main(String[] args) {
		
		String[] arr = {"1","2","3","-","4","5","6","7","-","8","9","10","11"};
		String merge = merge(arr);
		
	}
	
	static String merge(String[] arr) {
		String merge = "";
		
		for(int i=0; i<arr.length; i++) {
			
			if(!arr[i].equals("-")) {
				merge += arr[i];
			}
		}
		return merge;
	}
	
	static int sort(String str) {
		int sort = 0;
		
		sort = str.
	}
	
	
}
