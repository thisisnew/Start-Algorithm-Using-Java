package Ch06;

public class BubbleSort2 {
	public static void main(String[] args) {
		int[] a = {1,3,4,2,5,0};		
		
		bubbleSort(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	static void bubbleSort(int[] a){
		int num = a.length;
		
		for(int i =0; i<num-1; i++) {
			int exchg = 0;
			
			for(int j=num-1; j>i; j--) {
				
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					exchg++;
				}
			}
			if(exchg == 0) break;
		}
		
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
}
