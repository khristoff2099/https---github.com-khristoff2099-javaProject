public class lonelyInteger {	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,3,2,1};
		int r = one(a);
		System.out.println(r);
	}
	public static int one(int[] a) {
		int r = 0;
		for(int i: a) {
			r = r ^ i;
		}
		return r;
	}
}
