package Ch02;

public class Q2 {
	public static void main(String[] args) {
		
		int[] arr = {5, 10, 73, 2, -5, 42};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		reverArr(arr);
		
		System.out.print("역순 정렬을 마쳤습니다.");
	}
	
	public static void reverArr(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
		}
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		
	
		System.out.println(arr[idx1]+"과"+ arr[idx2] +" 를 교환합니다");
		
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
