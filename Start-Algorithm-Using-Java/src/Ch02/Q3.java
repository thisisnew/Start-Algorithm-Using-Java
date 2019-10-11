package Ch02;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 크기 설정 : ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("숫자 입력: ");
			arr[i] = scan.nextInt();	
		}
		
		int sum = sumOf(arr);
		
		System.out.println("합계: " + sum);
	}
	
	public static int sumOf(int[] arr) {
		
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
}
