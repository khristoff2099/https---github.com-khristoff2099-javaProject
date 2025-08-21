public class sumTwoIndexes {
	 public static void main(String[] args) {
	        int[] n = {4, 3, 2};
	        int t = 6;
	        int[] r = twoSum(n, t);
	        System.out.println(r[0] + " " + r[1]);
	    }
	    public static int[] twoSum(int[] n, int t) {
	        for(int i=0;i<n.length;i++) {
	            for(int j=i+1;j<n.length;j++) {
	                if(n[i] + n[j] == t)
	                    return new int[]{i, j};
	            }
	        }
	        return new int[]{-1, -1};
	    }    
}