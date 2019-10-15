package Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex01 {
	public static void main(String[] args) {
		
		String[] arr = {"1","2","3","-","4","5","6","7","-","8","9","10","11"};
		String merge = merge(arr);
		System.out.println(merge);
		
		List<String> list = sort(arr);
//		for(String val : list) {
//			System.out.printf(val);
//		}
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
	
	static List<String> sort(String[] arr) {
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].equals("-")) {
				list.add(arr[i]);
			}
		}

		Collections.sort(list);
		
		for(String val : list) {
			System.out.printf(val);
		}
		
		return list;
	}
	
}
