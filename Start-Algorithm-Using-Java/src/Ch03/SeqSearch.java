package Ch03;

import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 수:");
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("숫자 입력:");
			x[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.print("검색할 값:");
		int key = scan.nextInt();
		
		int idx = seqSearch(x, num, key);
		
	}
	
	public static int seqSearch(int[] arr, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i==n) {
				return -1;
			}
		}
	}
}	
