
public class uniqueNumber {
	public static void main(String[] args) {		
		int[] arr = {1,2,2,1,1,3};  
		System.out.println(contains(arr));		
	}
	public static boolean contains(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					return true;
				}
			}
		}
		return false;		
	}
}
