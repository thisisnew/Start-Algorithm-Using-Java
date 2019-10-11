package Ch02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 크기 설정 : ");
		int num = scan.nextInt();
		
		int[] b = new int[num];
		int[] a = new int[b.length];
		
		for(int i=0; i<num; i++) {
			System.out.print("숫자 입력: ");
			b[i] = scan.nextInt();	
		}
		
		copy(a, b);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
		
	}
	
	public static void copy(int[] a, int[] b) {
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
		
	}
}
