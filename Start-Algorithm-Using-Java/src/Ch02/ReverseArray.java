package Ch02;

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		revere(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void revere(int[] arr) {
			
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
		}
		
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1];
		arr[idx1]= arr[idx2];
		arr[idx2] = t;
	}

}
