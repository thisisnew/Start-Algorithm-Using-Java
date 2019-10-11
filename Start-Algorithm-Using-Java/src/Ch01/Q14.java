package Ch01;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다");
		System.out.print("단 수:");
		
		int no = sc.nextInt();
		square(no);
	}
	
	public static void square(int no) {
		for(int j=0; j<no; j++) {
			for(int i=0; i<no; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
