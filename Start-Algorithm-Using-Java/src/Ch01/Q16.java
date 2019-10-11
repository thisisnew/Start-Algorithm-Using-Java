package Ch01;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드을 출력합니다");
		System.out.print("단 수:");
		
		int no = sc.nextInt();
		pyr(no);
	}
	
	public static void pyr(int no) {
		for(int i=1; i<=no; i++) {
			
			for(int j=1; j<=no-i+1; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
}
