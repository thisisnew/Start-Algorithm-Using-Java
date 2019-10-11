package Ch02;

import java.util.Scanner;

public class MaxOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수 입력: ");
		
		int arr = sc.nextInt();
		
		int[] height = new int[arr];
		
		for(int i=0; i<arr; i++) {
			System.out.print(i+"번째 입력 :");
			height[i] = sc.nextInt();
		}
		
		int max = maxof(height);
		
		System.out.println("제일 큰 키는 " + max + "입니다.");
		
	}
	
	
	static int maxof(int[] height) {
		int max = height[0];

		for(int i=0; i<height.length; i++) {
			if(height[i]>max) {
				max = height[i];
			}
		}
		
		return max;
	}
}
