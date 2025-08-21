
public class stringParts {
	public static void main(String[] args) {
		
	    String s = "i like car";

		String[] p = s.split(" ");		
	    String p1 = p[0];
		String p2 = p[1];
		String p3 = p[2];			
		System.out.println(p3 + " " + p1 + " " + p2);
	    
	}
}