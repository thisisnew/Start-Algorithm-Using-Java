package Ch01;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형을 출력합니다");
		System.out.print("단 수:");
		
		int no = sc.nextInt();
	
		triangleLB(no);
		triangleLU(no);
		triangleRU(no);
		triangleRB(no);
	}
	
	public static void triangleLB(int no) {
		for(int i=1; i<=no; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleLU(int no) {
		for(int i=1; i<=no; i++) {
			for(int j=no; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int no) {
		for(int i=1; i<=no; i++) {
			
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j=no; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRB(int no) {
		for(int i=1; i<=no; i++) {

			for(int j=no-1; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
