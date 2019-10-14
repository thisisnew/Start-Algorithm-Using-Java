package Ch06;

public class Q2 {
	public static void main(String[] args) {
		int[] a = {1,3,4,2,5,0};		
		
		bubbleSort(a);
		
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
	}
	
	static void bubbleSort(int[] a) {
		
		int num  = a.length;
		
		int compCnt=0;
		int trdCnt = 0;
		
		for(int i=0; i<num-1; i++) {
			for(int j=num-1; j>i; j--) {
				compCnt++;
				
				for(int e=0; e<a.length; e++) {
					System.out.printf("%3d",a[e]);
				}
				System.out.println();
				
				if(a[j-1]>a[j]) {
					trdCnt++;
					swap(a, j-1, j);
				}
			}
		}
		System.out.println("비교: "+ compCnt);
		System.out.println("교환: "+ trdCnt);
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
		
	}
}

