
public class sumArrayIntegers {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {1,2,3,4,5};
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0;i<a1.length;i++) {
			sum1 += a1[i];	
		}
		for(int j=0;j<a1.length;j++) {			
			sum2 += a2[j];
		}				
		System.out.print(sum1 + sum2);
	}

}
