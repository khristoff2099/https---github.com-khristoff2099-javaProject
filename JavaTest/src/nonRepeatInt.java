import java.util.ArrayList;

public class nonRepeatInt {
    public static void main(String[] args) {
        int[] a = {0,0,1,1,2,2,3};
        ArrayList<Integer> arr = new ArrayList<>();       
		for(int i=0;i<a.length;i++){
			int c = 0;
		    for (int j=0;j<a.length;j++){
		        if(a[i] == a[j]) {
		            c++;
		        }
		    }
		    if(c == 1) {
		        arr.add(a[i]);
		    }
		}	    
		System.out.println(arr);
    }
}