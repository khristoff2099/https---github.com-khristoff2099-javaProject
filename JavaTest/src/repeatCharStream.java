import java.util.Set;
import java.util.HashSet;

public class repeatCharStream {
    public static void main(String[] args) {
    	String s = "christopher";
    	System.out.println(repeatChar(s));
    }
    private static char repeatChar(String s) {
    	final Set<Integer> h = new HashSet<>();
    	return (char) s.chars().reduce((a, i) -> {
	    	if (h.contains(i)) {
	    		return i;
	    	} else {
	    		h.add(i);
	    		return a;
	    	}
    	}).getAsInt();
    }
}