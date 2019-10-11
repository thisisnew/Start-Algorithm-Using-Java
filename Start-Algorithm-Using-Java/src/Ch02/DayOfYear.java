package Ch02;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("그 해 경과 일수를 구합니다.");
		System.out.print("년:"); int year = scan.nextInt();
		System.out.print("월:"); int month = scan.nextInt();
		System.out.print("일:"); int day = scan.nextInt();
		System.out.printf("그 해 %d일 째입니다.\n", dayOfYear(year, month, day));
	}
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=0; i<=m; i++) {
			days += mdays[isLeap(y)][i];
		}
		
		return days;
	}
}
